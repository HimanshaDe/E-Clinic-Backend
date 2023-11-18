package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.AdminDTO;
import com.medicalsystem.eclinic.dto.DoctorSpecialityDTO;
import com.medicalsystem.eclinic.service.DoctorService;
import com.medicalsystem.eclinic.service.DoctorSpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/doctor_speciality")
@CrossOrigin
public class DoctorSpecialityController {
    @Autowired
    private DoctorSpecialityService doctorSpecialityService;

    @PostMapping()
    public String save_doctor_speciality(@RequestBody DoctorSpecialityDTO doctorSpecialityDTO ){
        String message = doctorSpecialityService.saveDoctorSpeciality(doctorSpecialityDTO);

        return "";

    }


}
