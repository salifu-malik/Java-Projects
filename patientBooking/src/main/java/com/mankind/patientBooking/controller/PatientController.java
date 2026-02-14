package com.mankind.patientBooking.controller;

import com.mankind.patientBooking.entity.Patient;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/patients")
public class PatientController {

    @Autowired
    private  PatientService patientService;

    //Crete new patient
    @PostMapping
    public ResponseEntity<Patient> createPatient(@Valid  @RequestBody Patient patient) {
        Patient savedPatient = patientService.savePatient(patient);
        return ResponseEntity.ok(savedPatient);
    }

    //Get all patients
    @GetMapping
    public ResponseEntity<Patient> getAllPatients() {
        return ResponseEntity.ok(patientService.getAllPatients());

    }

    //Get patient by id
    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable  Long id) {
        Patient patient = patientService.getPatientById(id);
        return ResponseEntity.ok(patient);
    }

    //Update patient info
    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable  Long id, @Valid  @RequestBody Patient patient) {
        Patient updated = patientService.updatePatientById(id);
        return ResponseEntity.ok(patient);
    }

    //Delete patient
    @DeleteMapping("/{id}")
    public ResponseEntity<Patient> deletePatient(@PathVariable  Long id) {
        patientService.deletePatient(id);
        return ResponseEntity.noContent().build();
    }


}
