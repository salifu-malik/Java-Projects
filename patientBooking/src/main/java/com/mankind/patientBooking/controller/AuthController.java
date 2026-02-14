package com.mankind.patientBooking.controller;


import com.mankind.patientBooking.entity.Doctor;
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
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody registerRequest registerRequest) {
        AuthResponse response = authService.register(registerRequest);
    }

    @PostMapping("/refrest-token")
    public ResponseEntity<AuthResponse> refreshToken (@RequestHeader ("Authorization") String token){
        AuthResponse response = authService.refreshToken(token);
        return ResponseEntity.ok(response);
    }





}
