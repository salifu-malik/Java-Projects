package com.mankind.patientBooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String specialization;
    private String availableDays;
    private String lincenceNo;
    private int yearsOfExperience;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


}
