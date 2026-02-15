package com.mankind.patientBooking.repository;

import com.mankind.patientBooking.entity.RefreshToken;
import com.mankind.patientBooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByTokenHash(String hashed);
    void deleteByTokenHash(String hashed);
    void deleteByUser(User user);
}
