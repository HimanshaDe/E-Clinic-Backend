package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.DoctorDTO;
import com.medicalsystem.eclinic.dto.PatientDTO;
import com.medicalsystem.eclinic.dto.request.PatientLoginDTO;
import com.medicalsystem.eclinic.entity.Doctor;
import com.medicalsystem.eclinic.entity.Patient;
import com.medicalsystem.eclinic.repository.DoctorRepo;
import com.medicalsystem.eclinic.repository.PatientRepo;
import com.medicalsystem.eclinic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatienServiceIMPL implements PatientService {

    @Autowired
    private PatientRepo patientRepo;


    @Override
    public String savePatient(PatientDTO patientDTO) {
        Patient patient = new Patient(
          patientDTO.getPatientId(),patientDTO.getPatientName(),patientDTO.getBirthDate(),patientDTO.getNic(),patientDTO.getContact(),patientDTO.getAddress(),
          patientDTO.getEmail(),patientDTO.getGender(),patientDTO.getDoj(),patientDTO.getUsername(),patientDTO.getPassword()
        );
        patientRepo.save(patient);
        return null;
    }

    @Override
    public Patient validateLogin(PatientLoginDTO patientLoginDTO) {

        Optional<Patient> loginOptional = patientRepo.findByUsernameAndPassword(patientLoginDTO.getUsername(),patientLoginDTO.getPassword());
        if(!loginOptional.isPresent()){
            throw new RuntimeException("invalid login");
        }
        return loginOptional.get();
    }

    @Override
    public PatientDTO getPatientById(int patientId) {
        if(patientRepo.existsById(patientId)){
            Patient patient = patientRepo.getReferenceById(patientId);
            PatientDTO patientDTO = new PatientDTO(
                    patient.getPatientId(),patient.getPatientName(),patient.getBirthDate(),
                    patient.getNic(),patient.getContact(),patient.getAddress(),patient.getEmail(),
                    patient.getGender(),patient.getDoj(),patient.getUsername(),patient.getPassword()
            );
            return patientDTO;
        }else {
            throw new RuntimeException("No");
        }

    }

    @Override
    public List<PatientDTO> getAllPatients() {
        List<Patient> getAllPatients = patientRepo.findAll();

        List<PatientDTO> patientDTOList = new ArrayList<>();

        for (Patient patient : getAllPatients){
            PatientDTO patientDTO =new PatientDTO(
                   patient.getPatientId(),patient.getPatientName(),patient.getBirthDate(),patient.getNic(),patient.getContact(),patient.getAddress(),
                    patient.getEmail(),patient.getGender(),patient.getDoj(),patient.getUsername(),patient.getPassword()
            );
            patientDTOList.add(patientDTO);
        }
        return patientDTOList;
    }
}
