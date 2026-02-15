package com.mankind.patientBooking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;


@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String firstName;
    private String lastName;
    private String gender;
    private String region;
    private String city;
    private String address;
    private LocalDate dob;

    @Column(unique = true)
    private String email;

    private String password;

    private boolean accountNonLocked = true;

    private int failedAttempts = 0;

    private Timestamp lockTime;

    @Enumerated(EnumType.STRING)
    private Role role;

}
