package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.DoctorSpecialityDTO;
import com.medicalsystem.eclinic.entity.DoctorSpeciality;
import com.medicalsystem.eclinic.repository.DoctorSpecialityRepo;
import com.medicalsystem.eclinic.service.DoctorSpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorSpecialityServiceIMPL implements DoctorSpecialityService {

    @Autowired
    private DoctorSpecialityRepo doctorSpecialityRepo;

    @Override
    public String saveDoctorSpeciality(DoctorSpecialityDTO doctorSpecialityDTO) {
        DoctorSpeciality doctorSpeciality = new DoctorSpeciality(
                doctorSpecialityDTO.getDoctor_speciality_id(),doctorSpecialityDTO.getSpecialityType(),doctorSpecialityDTO.getDescription()
        );
        System.out.println(doctorSpeciality);
        doctorSpecialityRepo.save(doctorSpeciality);
        return null;
    }
}
