package com.mankind.patientBooking.repository;

import com.mankind.patientBooking.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
