package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.DoctorDTO;
import com.medicalsystem.eclinic.dto.HospitalDTO;
import com.medicalsystem.eclinic.entity.Hospital;
import com.medicalsystem.eclinic.repository.HospitalRepo;
import com.medicalsystem.eclinic.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


public class HospitalServiceIMPL implements HospitalService {

    @Autowired
    private HospitalRepo hospitalRepo;

    @Override
    public String saveHospital(HospitalDTO hospitalDTO) {
        Hospital hospital = new Hospital(
                hospitalDTO.getHospitalId(),hospitalDTO.getHospitalName(),hospitalDTO.getImageName(),hospitalDTO.getAddress()
        );
        hospitalRepo.save(hospital);

        return null;
    }

    @Override
    public List<HospitalDTO> getAllHospitals() {
        List<Hospital> getAllHospitals = hospitalRepo.findAll();

        List <HospitalDTO> hospitalDTOList = new ArrayList<>();

                for(Hospital hospital : getAllHospitals){
                    HospitalDTO hospitalDTO = new HospitalDTO(
                            hospital.getHospitalId(),hospital.getHospitalName(),hospital.getImageName(),hospital.getAddress()
                    );
                    hospitalDTOList.add(hospitalDTO);

                }


        return hospitalDTOList;
    }



}


