package com.mankind.patientBooking.service;

import com.mankind.patientBooking.dto.AuthResponse;
import com.mankind.patientBooking.dto.LoginRequest;
import com.mankind.patientBooking.dto.RegisterRequest;
import com.mankind.patientBooking.entity.Patient;
import com.mankind.patientBooking.entity.Role;
import com.mankind.patientBooking.entity.User;
import com.mankind.patientBooking.exception.BadRequestException;
import com.mankind.patientBooking.repository.PatientRepository;
import com.mankind.patientBooking.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final PatientRepository patientRepository;


    //Login method
    public AuthResponse login(LoginRequest request) {
        User user = UserRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Invalid Credentials"));
        if(!PasswordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid Credentials");
        }
        String token = jwtService.generateToken(user);
        return new AuthResponse(token);
    }

    //Register method
    public AuthResponse register(RegisterRequest request) {
        if(UserRepository.existsByEmail(request.getEmail())) {
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
        user.setAddress(request.getAddress());
        user.setDob(request.getDob());
        user.setGender(request.getGender());
        user.setRole(request.getRole());

        userRepository.save(user);

        //If role is  patient, patient entity to be created
        if(request.getRole() == Role.PATIENT) {
            Patient patient = new Patient();
            patient.setUser(user);
            patientRepository.save(patient);

        }

        String token = jwtService.generateToken(user);
        return new AuthResponse(token);


    }


}
