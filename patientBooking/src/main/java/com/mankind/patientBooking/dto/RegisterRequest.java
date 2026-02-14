package com.mankind.patientBooking.dto;

import com.mankind.patientBooking.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;


@Data
public class RegisterRequest {
    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String gender;

    @NotBlank
    private LocalDate dob;

    @NotBlank
    private String address;

    @NotBlank
    private String city;

    @NotBlank
    private String region;

    @NotBlank
    @Email
    private String email;

    @NotNull
    private Role role;

    @NotBlank
    private String password;

    @NotBlank
    private String confirmPassword;

}
