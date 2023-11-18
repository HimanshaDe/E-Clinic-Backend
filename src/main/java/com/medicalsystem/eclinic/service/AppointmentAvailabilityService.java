package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.DoctorAppointmentAvailabilityDTO;

public interface AppointmentAvailabilityService {
    DoctorAppointmentAvailabilityDTO getAppointmentByDoctor(int doctorId);
//    DoctorAppointmentAvailabilityDTO getAppointmentByDoctor(int doctorId);
}
