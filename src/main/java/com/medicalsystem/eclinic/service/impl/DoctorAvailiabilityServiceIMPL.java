package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.DoctorAvailabilityDTO;
import com.medicalsystem.eclinic.repository.DoctorCalenderRepo;
import com.medicalsystem.eclinic.service.DoctorAvailiabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoctorAvailiabilityServiceIMPL implements DoctorAvailiabilityService {

    @Autowired
    private DoctorCalenderRepo doctorCalenderRepo;


    @Override
    public DoctorAvailabilityDTO getDoctorDatesById(int doctorId) {
        if(doctorCalenderRepo.existsById(doctorId)){

            DoctorAvailabilityDTO doctorAvailabilityDTO = new DoctorAvailabilityDTO(


            );

            return doctorAvailabilityDTO;


            }else{
            throw new RuntimeException("invalid");
        }


    }
}
