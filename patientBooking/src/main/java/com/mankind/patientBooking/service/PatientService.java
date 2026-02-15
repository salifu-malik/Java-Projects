package com.mankind.patientBooking.service;


import com.mankind.patientBooking.entity.Patient;
import com.mankind.patientBooking.exception.ResourceNotFoundException;
import com.mankind.patientBooking.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient savePatient(Patient patient) {

        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No patient record found with the id" + id));

    }

    public  Patient updatePatientById(Long id, Patient updatedPatient) {
        Patient patient = getPatientById(id);
        patient.setBookDate(updatedPatient.getBookDate());
        patient.setBookTime(updatedPatient.getBookTime());

        //optionally update the linked user
        //patient.setUser(updatedPatient.getUser());
        return patientRepository.save(patient);
    }

    public void deletePatientById(Long id) {
        Patient patient = getPatientById(id);
        patientRepository.delete(patient);
    }
}
