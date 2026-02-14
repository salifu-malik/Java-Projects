package com.mankind.patientBooking.repository;

import com.mankind.patientBooking.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
