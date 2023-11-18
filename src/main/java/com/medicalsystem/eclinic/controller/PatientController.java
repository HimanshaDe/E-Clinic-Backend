package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.PatientDTO;
import com.medicalsystem.eclinic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/patient")
@CrossOrigin
public class PatientController {

    @Autowired
    private PatientService patientService;
    @PostMapping()
    public String savePatient(@RequestBody PatientDTO patientDTO){
        String message = patientService.savePatient(patientDTO);
        return message;

    }

    @GetMapping(path = "/get-all-patients")
    public List<PatientDTO> getAllPatients(){
        List<PatientDTO> allPatients = patientService.getAllPatients();
        return allPatients;
    }

    @GetMapping(
            path = "/get-by-id/{id}"
    )
    public PatientDTO getPatientsById(@PathVariable(value = "id") int patient_id){
        PatientDTO patientDTO = patientService.getPatientById(patient_id);

        return  patientDTO;

    }
}
