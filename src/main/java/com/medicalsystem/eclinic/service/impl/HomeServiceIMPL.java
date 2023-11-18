package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.request.HomeInfoDTO;
import com.medicalsystem.eclinic.repository.DoctorRepo;
import com.medicalsystem.eclinic.repository.HospitalRepo;
import com.medicalsystem.eclinic.repository.PatientRepo;
import com.medicalsystem.eclinic.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class HomeServiceIMPL implements HomeService {

    @Autowired
    private DoctorRepo doctorRepo;
    @Autowired
    private PatientRepo patientRepo;
    @Autowired
    private HospitalRepo hospitalRepo;
    @Override
    public HomeInfoDTO getCounter() {

        HomeInfoDTO homeInfoDTO= new HomeInfoDTO();
        homeInfoDTO.setDoctorCount(doctorRepo.findAll().size());
        homeInfoDTO.setPatientCount(patientRepo.findAll().size());
        homeInfoDTO.setHospitalCount(hospitalRepo.findAll().size());
        System.out.println(homeInfoDTO);
        return homeInfoDTO;

    }
}
