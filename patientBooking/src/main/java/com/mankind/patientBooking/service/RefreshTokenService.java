package com.mankind.patientBooking.service;

import com.mankind.patientBooking.entity.RefreshToken;
import com.mankind.patientBooking.entity.User;
import com.mankind.patientBooking.repository.RefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.time.Instant;
import java.util.Base64;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RefreshTokenService {

    private final RefreshTokenRepository repository;

    private static final long REFRESH_TOKEN_EXPIRY_SECONDS = 7 * 24 * 60 * 60;

    // Crete refresh token
    public RefreshToken createRefreshToken(User user, String deviceName, String ipAddress) {
        // Generate raw token
        String rawToken = UUID.randomUUID().toString();


        String hashedToken = hashToken(rawToken);

        // To build entity
        RefreshToken refreshToken = RefreshToken.builder()
                .user(user)
                .tokenHash(hashedToken)
                .deviceName(deviceName)
                .ipAddress(ipAddress)
                .expiryDate(Instant.now().plusSeconds(REFRESH_TOKEN_EXPIRY_SECONDS))
                .build();


        repository.save(refreshToken);

        // Return entity with RAW token for client but not stored in DB
        refreshToken.setToken(rawToken);
        return refreshToken;
    }

    // Verify token
    public RefreshToken verifyRefreshToken(String rawToken) {
        String hashed = hashToken(rawToken);

        RefreshToken token = repository.findByTokenHash(hashed)
                .orElseThrow(() -> new RuntimeException("Invalid refresh token"));

        if (token.getExpiryDate().isBefore(Instant.now())) {
            repository.delete(token);
            throw new RuntimeException("Refresh token expired");
        }

        return token;
    }

    // Delete refresh  token
    public void deleteByToken(String rawToken) {
        repository.deleteByTokenHash(hashToken(rawToken));
    }

    // Delete all user tokens
    public void deleteAllByUser(User user) {
        repository.deleteByUser(user);
    }

    // Hash Token
    private String hashToken(String token) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(token.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (Exception e) {
            throw new RuntimeException("Error hashing refresh token", e);
        }
    }
}
