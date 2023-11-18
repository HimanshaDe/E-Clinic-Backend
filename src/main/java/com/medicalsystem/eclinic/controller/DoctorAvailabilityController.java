package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.DoctorAvailabilityDTO;
import com.medicalsystem.eclinic.service.DoctorAvailiabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/doctor_availability")
@CrossOrigin
public class DoctorAvailabilityController {

    private final DoctorAvailiabilityService doctorAvailiabilityService;

@Autowired
    public DoctorAvailabilityController(DoctorAvailiabilityService doctorAvailiabilityService) {
        this.doctorAvailiabilityService = doctorAvailiabilityService;
    }

    @GetMapping(
            path = "/{id}"
    )

   public DoctorAvailabilityDTO doctorAvailabilityDTO(@PathVariable(value = "id")int doctor_id){
    DoctorAvailabilityDTO doctorAvailabilityDTO = doctorAvailiabilityService.getDoctorDatesById(doctor_id);
    return doctorAvailabilityDTO;
    }
    

}
