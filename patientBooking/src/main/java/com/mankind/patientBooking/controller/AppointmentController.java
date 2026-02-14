package com.mankind.patientBooking.controller;

import com.mankind.patientBooking.entity.Appointment;
import com.mankind.patientBooking.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    public AppointmentService appointmentService;

    //Book a new appointment
    @PostMapping
    public ResponseEntity<Appointment> bookAppointment(@Valid @RequestBody Appointment request) {
        Appointment appointment = AppointmentService.bookAppointment(request);
        return ResponseEntity.ok(appointment);

    }

    //Get all appointments
    @GetMapping
    public ResponseEntity<List<Appointment>> getAllAppointments() {
        return ResponseEntity.ok(appointmentService.getAllAppointments());

    }

    //Get appointment for a patient
    @GetMapping("/patient/{patient_id}")
    public ResponseEntity<List<Appointment>> getAppointmentsByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(appointmentService.getAppointmentsByPatientId(patientId));
    }

    //Update appointment status
    @PutMapping("{id}/status")
    public ResponseEntity<Appointment> updateAppointmentStatus(@PathVariable Long id, @RequestParam String  status ) {
        Appointment updated = appointmentService.updateAppointmentStatus(id, status);
        return ResponseEntity.ok(updated);
    }

    //Cancel appointment
    @DeleteMapping("/{id}")
    public ResponseEntity<Appointment> cancelAppointment(@PathVariable Long id) {
        appointmentService.cancelAppointment(id);
        return ResponseEntity.noContent().build();
    }

}
