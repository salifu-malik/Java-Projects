package com.mankind.patientBooking.controller;


import com.mankind.patientBooking.dto.AuthResponse;
import com.mankind.patientBooking.dto.LoginRequest;
import com.mankind.patientBooking.dto.RegisterRequest;
import com.mankind.patientBooking.entity.Doctor;
import com.mankind.patientBooking.service.RefreshTokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    // User login
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login (@Valid @RequestBody LoginRequest loginRequest) {
        AuthResponse response = authService.login(loginRequest);
        return ResponseEntity.ok(response);
    }

    //User Signup
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody RegisterRequest registerRequest) {
        AuthResponse response = authService.register(registerRequest);
    }

    @PostMapping("/refresh-token")
    public ResponseEntity<AuthResponse> refreshToken (@RequestBody  String refreshToken){
        AuthResponse response = authService.refreshToken(refreshToken);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(@RequestBody String refreshToken) {

        refreshTokenService.deleteByToken(refreshToken);

        return ResponseEntity.ok("Logged out successfully");
    }



}
