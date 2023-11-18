package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.DoctorCalenderDTO;
import com.medicalsystem.eclinic.entity.DoctorCalender;

import java.util.List;

public interface DoctorCalenderService {
    String saveDoctorCalender(DoctorCalenderDTO doctorCalenderDTO);


    List<DoctorCalender> getDoctorAppointments(final Integer doctorId);
}
