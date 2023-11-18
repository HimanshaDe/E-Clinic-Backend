package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.AppointmentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppointmentService {
    String saveAppointment(AppointmentDTO appointmentDTO);

    List<AppointmentDTO> getAllAppointments();

    AppointmentDTO getDoctorById(int doctorId);

    AppointmentDTO getDoctorByAppointment(int doctorId);
}
