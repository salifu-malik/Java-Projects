package com.mankind.patientBooking.repository;

import com.mankind.patientBooking.entity.Appointment;
import com.mankind.patientBooking.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Appointment> findByPatient_Id(Long patientId);

}
