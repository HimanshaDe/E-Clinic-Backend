package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.DoctorAppointmentAvailabilityDTO;
import com.medicalsystem.eclinic.dto.DoctorAvailabilityDTO;
import com.medicalsystem.eclinic.service.AppointmentAvailabilityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/appointment_availability")
@CrossOrigin
public class AppointmentAvailabilityController {

    private final AppointmentAvailabilityService appointmentAvailabilityService;

    public AppointmentAvailabilityController(AppointmentAvailabilityService appointmentAvailabilityService) {
        this.appointmentAvailabilityService = appointmentAvailabilityService;
    }

    @GetMapping(
            path = "/{id}"
    )

    public DoctorAppointmentAvailabilityDTO doctorAppointmentAvailabilityDTO(@PathVariable(value = "id")int doctor_id){
        DoctorAppointmentAvailabilityDTO doctorAppointmentAvailabilityDTO = appointmentAvailabilityService.getAppointmentByDoctor(doctor_id);
        return doctorAppointmentAvailabilityDTO;
    }

}
