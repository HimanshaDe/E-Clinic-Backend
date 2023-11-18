package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.DoctorAvailabilityDTO;

public interface DoctorAvailiabilityService {
    DoctorAvailabilityDTO getDoctorDatesById(int doctorId);
}
