package com.mankind.patientBooking.service;

import com.mankind.patientBooking.dto.AuthResponse;
import com.mankind.patientBooking.dto.LoginRequest;
import com.mankind.patientBooking.dto.RegisterRequest;
import com.mankind.patientBooking.entity.Patient;
import com.mankind.patientBooking.entity.RefreshToken;
import com.mankind.patientBooking.entity.Role;
import com.mankind.patientBooking.entity.User;
import com.mankind.patientBooking.exception.BadRequestException;
import com.mankind.patientBooking.repository.PatientRepository;
import com.mankind.patientBooking.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final PatientRepository patientRepository;
    private final RefreshTokenService refreshTokenService;


    //Login method
    public AuthResponse login(LoginRequest request, HttpServletRequest httpRequest) {

        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Invalid Credentials"));

        if (!user.isAccountNonLocked()) {
            throw new RuntimeException("Account Locked");
        }

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {

            user.setFailedAttempts(user.getFailedAttempts() + 1);

            if (user.getFailedAttempts() >= 5) {
                user.setAccountNonLocked(false);
                user.setLockTime(Timestamp.from(Instant.now()));
            }

            userRepository.save(user);
            throw new RuntimeException("Invalid Credentials");
        }

        // Reset failed attempts on successful login
        user.setFailedAttempts(0);
        userRepository.save(user);

        String accessToken = jwtService.generateAccessToken(user);

        RefreshToken refreshToken =
                refreshTokenService.createRefreshToken(
                        user,
                        httpRequest.getHeader("User-Agent"),
                        httpRequest.getRemoteAddr()
                );

        return new AuthResponse(accessToken, refreshToken.getToken());
    }


    //Register method
    public AuthResponse register(RegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new BadRequestException("Email Already Exists");
        }

        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setCity(request.getCity());
        user.setAddress(request.getAddress());
        user.setEmail(request.getEmail());
        user.setRegion(request.getRegion());
        user.setDob(request.getDob());
        user.setGender(request.getGender());
        user.setRole(request.getRole());
        user.setAccountNonLocked(true);
        user.setFailedAttempts(0);

        userRepository.save(user);

        // If role is patient, create Patient entity
        if (request.getRole() == Role.PATIENT) {
            Patient patient = new Patient();
            patient.setUser(user);
            patientRepository.save(patient);
        }

        String accessToken = jwtService.generateAccessToken(user);

        RefreshToken refreshToken =
                refreshTokenService.createRefreshToken(
                        user,
                        "Registration",
                        "N/A"
                );

        return new AuthResponse(accessToken, refreshToken.getToken());
    }


}
