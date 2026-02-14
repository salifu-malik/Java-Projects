package com.mankind.patientBooking.service;

import com.mankind.patientBooking.dto.AppointmentRequest;
import com.mankind.patientBooking.entity.Appointment;
import com.mankind.patientBooking.entity.AppointmentStatus;
import com.mankind.patientBooking.entity.Doctor;
import com.mankind.patientBooking.entity.Patient;
import com.mankind.patientBooking.exception.ResourceNotFoundException;
import com.mankind.patientBooking.repository.AppointmentRepository;
import com.mankind.patientBooking.repository.DoctorRepository;
import com.mankind.patientBooking.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final AppointmentRepository appointmentRepository;


    //Book Appointment
    public Appointment bookAppointment(AppointmentRequest request ) {
       Patient patient = patientRepository.findById(request.getPatientId())
               .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));

               Doctor doctor = doctorRepository.findById(request.getDoctorId())
                       .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));

               Appointment appointment = new Appointment();
               appointment.setPatient(patient);
               appointment.setDoctor(doctor);
               appointment.setAppointmentDate(request.getAppointmentDate());
               appointment.setStatus(AppointmentStatus.PENDING);
               appointment.setAppointmentTime(request.getAppointmentTime());
               appointmentRepository.save(appointment);

               return appointmentRepository.save(appointment);

    }

//List all appointments
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    //List appointment by patient
    public List<Appointment> getAppointmentsByPatient(Long patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }

    //Update appointment
    public Appointment updateAppointment(Long appointmentId, String status) {
        Appointment appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(()-> new ResourceNotFoundException("No appointment found "));

        appointment.setStatus(AppointmentStatus.valueOf(status.toUpperCase()));
        return appointmentRepository.save(appointment);

    }

    //Cancel appointment
    public Appointment canceleAppointment(Long appointmentId) {
        Appointment appointment = appointmentRepository.findById(appointmentId)
                        .orElseThrow(()-> new ResourceNotFoundException("Appointment not found"));
        appointment.setStatus(AppointmentStatus.CANCELLED);
        return appointmentRepository.save(appointment);
    }



}
