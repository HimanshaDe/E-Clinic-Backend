package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.DoctorAppointmentAvailabilityDTO;
import com.medicalsystem.eclinic.dto.DoctorAvailabilityDTO;
import com.medicalsystem.eclinic.repository.AppointmentRepo;
import com.medicalsystem.eclinic.service.AppointmentAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentAvailabilityServiceIMPL implements AppointmentAvailabilityService {
    @Autowired
    private AppointmentRepo appointmentRepo;

    @Override
    public DoctorAppointmentAvailabilityDTO getAppointmentByDoctor(int doctorId) {
        if(appointmentRepo.existsById(doctorId)){

           DoctorAppointmentAvailabilityDTO doctorAppointmentAvailabilityDTO = new DoctorAppointmentAvailabilityDTO(
           );

            return doctorAppointmentAvailabilityDTO;
        }else{
            throw new RuntimeException("invalid");
        }
    }
}
