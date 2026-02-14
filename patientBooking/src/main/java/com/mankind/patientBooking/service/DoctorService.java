package com.mankind.patientBooking.service;

import com.mankind.patientBooking.entity.Doctor;
import com.mankind.patientBooking.exception.ResourceNotFoundException;
import com.mankind.patientBooking.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctors() {

        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with "+ id));
    }

    public Doctor updateDoctor( Long id, Doctor updatedDoctor) {
        Doctor doctor = getDoctorById(id);
        doctor.setSpecialization(updatedDoctor.getSpecialization());
        doctor.setAvailableDays(updatedDoctor.getAvailableDays());
        doctor.setLincenceIssueDate(updatedDoctor.getLincenceIssueDate());
        doctor.setLincenceExpiryDate(updatedDoctor.getLincenceExpiryDate());
        doctor.setYearsOfExperience(updatedDoctor.getYearsOfExperience());
        doctor.setEndTime(updatedDoctor.getEndTime());
        doctor.setStartTime(updatedDoctor.getStartTime());
        return doctorRepository.save(doctor);
    }

    public void deleteDoctorById(Long id) {
        Doctor doctor = getDoctorById(id);
        doctorRepository.delete(doctor);
    }
}
