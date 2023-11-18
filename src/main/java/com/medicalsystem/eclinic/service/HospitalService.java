package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.DoctorDTO;
import com.medicalsystem.eclinic.dto.HospitalDTO;

import java.util.List;

public interface HospitalService {

    String saveHospital(HospitalDTO hospitalDTO);

    List<HospitalDTO> getAllHospitals();
}
