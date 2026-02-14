package com.mankind.patientBooking.repository;

import com.mankind.patientBooking.entity.Appointment;
import com.mankind.patientBooking.entity.AppointmentStatus;
import com.mankind.patientBooking.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Appointment> findByDoctor_Id(Long doctorId);

    List<Appointment> findByDoctor_IdAndAppointmentDate(Long doctorId, LocalDate appointmentDate);
    List<Appointment> findByStatus(AppointmentStatus status);


}
