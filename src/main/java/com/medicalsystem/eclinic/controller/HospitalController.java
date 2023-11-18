package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.DoctorDTO;
import com.medicalsystem.eclinic.dto.HospitalDTO;
import com.medicalsystem.eclinic.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/hospital")
@CrossOrigin
public class HospitalController {


    @Autowired
    private HospitalService hospitalService;
    @PostMapping
    public String saveHospital(@RequestBody HospitalDTO hospitalDTO){

        String message =  hospitalService.saveHospital(hospitalDTO);
        return message;
    }

    @GetMapping()
    public List<HospitalDTO> getAllHospitals(){
        List<HospitalDTO> allHospitals = hospitalService.getAllHospitals();
        return allHospitals;
    }


}
