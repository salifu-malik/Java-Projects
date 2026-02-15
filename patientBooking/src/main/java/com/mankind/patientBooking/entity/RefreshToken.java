package com.mankind.patientBooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
    private String token;

    private String tokenHash;

    private String deviceName;

    private String ipAddress;

    private Instant expiryDate;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;
}
