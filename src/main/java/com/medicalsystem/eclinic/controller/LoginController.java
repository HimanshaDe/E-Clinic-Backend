package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.LoginRequestDTO;
import com.medicalsystem.eclinic.dto.request.DoctorLoginDTO;
import com.medicalsystem.eclinic.dto.request.PatientLoginDTO;
import com.medicalsystem.eclinic.entity.Doctor;
import com.medicalsystem.eclinic.entity.Patient;
import com.medicalsystem.eclinic.service.DoctorService;
import com.medicalsystem.eclinic.service.LoginService;
import com.medicalsystem.eclinic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/login")
@CrossOrigin
public class LoginController {

    @Autowired
    private final DoctorService doctorService;
    private final LoginService loginService;
    private final PatientService patientService;


    @Autowired
    public LoginController(DoctorService doctorService, LoginService loginService, PatientService patientService) {
        this.doctorService = doctorService;
        this.loginService = loginService;

        this.patientService = patientService;
    }

    @PostMapping(path = "/admin")
    public ResponseEntity<Void> login(@RequestBody LoginRequestDTO loginRequest) {
        loginService.validateLogin(loginRequest);
        return ResponseEntity.ok().build();
    }

    @PostMapping(path = "/doctor")
    public Doctor loginDoctor(@RequestBody DoctorLoginDTO doctorLoginDTO) {
        Doctor doctor = doctorService.validateLogin(doctorLoginDTO);
        return doctor;
    }

    @PostMapping(path = "/patient")
    public Patient loginPatient(@RequestBody PatientLoginDTO patientLoginDTO) {
        Patient patient = patientService.validateLogin(patientLoginDTO);

        return patient;
    }

}
