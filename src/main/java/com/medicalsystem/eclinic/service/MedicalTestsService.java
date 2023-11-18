package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.MedicalTestsDTO;

import java.util.List;

public interface MedicalTestsService {
    String saveMedicalTests(MedicalTestsDTO medicalTestsDTO);

    List<MedicalTestsDTO> getAllTests();
}
