package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.DoctorDTO;
import com.medicalsystem.eclinic.dto.LoginRequestDTO;
import com.medicalsystem.eclinic.dto.request.DoctorLoginDTO;
import com.medicalsystem.eclinic.dto.request.DoctorUpdateDTO;
import com.medicalsystem.eclinic.entity.Admin;
import com.medicalsystem.eclinic.entity.Doctor;
import com.medicalsystem.eclinic.repository.AdminRepo;
import com.medicalsystem.eclinic.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface DoctorService {




     List<DoctorDTO> getAllDoctors();
    public String saveDoctor(DoctorDTO doctorDTO );

    String updateDoctor(DoctorUpdateDTO doctorUpdateDTO);


    DoctorDTO getDoctorById(int doctorId);


    Doctor validateLogin(DoctorLoginDTO doctorLoginDTO);
}
