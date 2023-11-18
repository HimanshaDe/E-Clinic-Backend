package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.DoctorDTO;
import com.medicalsystem.eclinic.dto.MedicalTestsDTO;
import com.medicalsystem.eclinic.service.MedicalTestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/medical_tests")
@CrossOrigin
public class MedicalTestsController {

    @Autowired
    private MedicalTestsService medicalTestsService;

    @PostMapping
    public String saveMedicalTests(@RequestBody MedicalTestsDTO medicalTestsDTO){
        String message = medicalTestsService.saveMedicalTests(medicalTestsDTO);
        return message;
    }

    @GetMapping
    public List<MedicalTestsDTO> getAllTests(){
        List<MedicalTestsDTO> allTests = medicalTestsService.getAllTests();
        return allTests;
    }

}
