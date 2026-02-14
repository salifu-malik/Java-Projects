package com.mankind.patientBooking.repository;

import com.mankind.patientBooking.entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {

}
