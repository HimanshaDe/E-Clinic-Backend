package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.MedicalTestsDTO;
import com.medicalsystem.eclinic.entity.MedicalTests;
import com.medicalsystem.eclinic.repository.MedicalTestsRepo;
import com.medicalsystem.eclinic.service.MedicalTestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicalTestsServiceIMPL implements MedicalTestsService {
    @Autowired
    private MedicalTestsRepo medicalTestsRepo;
    @Override
    public String saveMedicalTests(MedicalTestsDTO medicalTestsDTO) {
        MedicalTests medicalTests = new MedicalTests(
                medicalTestsDTO.getMedicalTestId(),medicalTestsDTO.getMedicalTest(),medicalTestsDTO.getDescription()
        );

       medicalTestsRepo.save(medicalTests);
        return null;
    }

    @Override
    public List<MedicalTestsDTO> getAllTests() {
        List<MedicalTests> getAllTests = medicalTestsRepo.findAll();

        List<MedicalTestsDTO> medicalTestsDTOList = new ArrayList<>();

        for(MedicalTests medicalTests : getAllTests){
            MedicalTestsDTO medicalTestsDTO = new MedicalTestsDTO(
                    medicalTests.getMedicalTestId(), medicalTests.getMedicalTest(),medicalTests.getDescription()
            );
            medicalTestsDTOList.add(medicalTestsDTO);
        }
        return medicalTestsDTOList;
    }
}
