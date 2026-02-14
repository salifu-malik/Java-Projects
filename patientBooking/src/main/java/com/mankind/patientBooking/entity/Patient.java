package com.mankind.patientBooking.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="patients")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dob;
    private LocalDate bookDate;

    @NotNull
    private LocalTime bookTime;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")

    private User user;
}
