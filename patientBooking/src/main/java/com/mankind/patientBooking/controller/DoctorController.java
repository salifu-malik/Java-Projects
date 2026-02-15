package com.mankind.patientBooking.controller;

import com.mankind.patientBooking.entity.Doctor;
import com.mankind.patientBooking.service.DoctorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    //Create a doctor
    @PostMapping
    public ResponseEntity<Doctor> createDoctor(@Valid @RequestBody Doctor doctor) {
        Doctor savedDoctor = doctorService.createDoctor(doctor);
        return ResponseEntity.ok().body(savedDoctor);

    }

    //Get all doctors
    @GetMapping
    public ResponseEntity<Doctor> getAllDoctors() {
        return ResponseEntity.ok((Doctor) doctorService.getAllDoctors());
    }

    //Get a doctor by ID
    @GetMapping("/{doctorID}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable Long doctorID) {
        Doctor doctor = doctorService.getDoctorById(doctorID);
        return ResponseEntity.ok().body(doctor);
    }

    //Update doctor Records
    @PutMapping("/{id}")
    public ResponseEntity<Doctor> updateDoctor(@PathVariable Long id, @Valid @RequestBody Doctor doctor) {
        Doctor updatedDoctor = doctorService.updateDoctor(id, doctor);
        return ResponseEntity.ok().body(updatedDoctor);
    }

    //Delete a doctor
    @DeleteMapping("/{id}")
    public ResponseEntity<Doctor> deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctorById(id);
        return ResponseEntity.noContent()
                .build();
    }

}
