package com.mankind.patientBooking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String specialization;
    private String availableDays;
    private LocalTime startTime;
    private LocalTime endTime;
    private String lincenceNo;
    private LocalDate lincenceIssueDate;
    private LocalDate lincenceExpiryDate;
    private int yearsOfExperience;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


}
