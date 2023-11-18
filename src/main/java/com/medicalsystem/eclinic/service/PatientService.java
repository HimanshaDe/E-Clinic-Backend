package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.PatientDTO;
import com.medicalsystem.eclinic.dto.request.PatientLoginDTO;
import com.medicalsystem.eclinic.entity.Patient;

import java.util.List;

public interface PatientService {

    List<PatientDTO> getAllPatients();

    String savePatient(PatientDTO patientDTO);

    Patient validateLogin(PatientLoginDTO patientLoginDTO);

    PatientDTO getPatientById(int patientId);
}
