package com.mankind.patientBooking.repository;

import com.mankind.patientBooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

     static Optional<User> findByEmail(String email);

     static boolean existsByEmail(String email);

}
