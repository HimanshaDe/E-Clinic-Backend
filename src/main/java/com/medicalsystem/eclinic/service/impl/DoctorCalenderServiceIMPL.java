package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.DoctorCalenderDTO;
import com.medicalsystem.eclinic.entity.Doctor;
import com.medicalsystem.eclinic.entity.DoctorCalender;
import com.medicalsystem.eclinic.repository.DoctorCalenderRepo;
import com.medicalsystem.eclinic.service.DoctorCalenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorCalenderServiceIMPL implements DoctorCalenderService {

    @Autowired
    DoctorCalenderRepo doctorCalenderRepo;

    @Override
    public String saveDoctorCalender(DoctorCalenderDTO doctorCalenderDTO) {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorCalenderDTO.getDoctorId());
        DoctorCalender doctorCalender = new DoctorCalender(
                doctorCalenderDTO.getCalenderId(), doctor, doctorCalenderDTO.getTime(),doctorCalenderDTO.getNumber_of_patients(),doctorCalenderDTO.getDate(),doctorCalenderDTO.getHospitalName()
        );
        System.out.println(doctorCalender);
        doctorCalenderRepo.save(doctorCalender);
        return null;
    }

    @Override
    public List<DoctorCalender> getDoctorAppointments(Integer doctorId) {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        return doctorCalenderRepo.findAllAppointments(doctor);
    }
}
