package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.DoctorAvailabilityDTO;
import com.medicalsystem.eclinic.dto.DoctorCalenderDTO;
import com.medicalsystem.eclinic.entity.Appointment;
import com.medicalsystem.eclinic.entity.DoctorCalender;
import com.medicalsystem.eclinic.repository.AppointmentRepo;
import com.medicalsystem.eclinic.service.DoctorCalenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/doctor_calender")
@CrossOrigin

public class CalenderController {

    @Autowired
    private DoctorCalenderService doctorCalenderService;
    @Autowired
    private AppointmentRepo appointmentRepo;

    @PostMapping
    public String saveDoctorCalender(@RequestBody DoctorCalenderDTO doctorCalenderDTO) {

        String message = doctorCalenderService.saveDoctorCalender(doctorCalenderDTO);
        return message;
    }

    @GetMapping("/available-appointments/{doctorId}")
    private List<DoctorAvailabilityDTO> getAvailableAppointmentDates(@PathVariable("doctorId") final Integer doctorId) {
        List<DoctorCalender> doctorAppointments = doctorCalenderService.getDoctorAppointments(doctorId);


        return doctorAppointments.stream().map(doctorCalender -> {
            DoctorAvailabilityDTO availabilityDTO = new DoctorAvailabilityDTO();
            availabilityDTO.setDoctorId(doctorCalender.getDoctor().getDoctorId());
            availabilityDTO.setDate(doctorCalender.getDate());
            availabilityDTO.setTime(doctorCalender.getTime());
            availabilityDTO.setHospitalName(doctorCalender.getHospitalName());
            availabilityDTO.setCalenderId(doctorCalender.getCalenderId());
            availabilityDTO.setNumber_of_patients(doctorCalender.getNumber_of_patients());

            List<Appointment> allByCalenderId = appointmentRepo.findAllByCalenderId(doctorCalender);
            availabilityDTO.setAppointmentCount(allByCalenderId.size());

//            availabilityDTO.setNextAppointmentTime();
            return availabilityDTO;
        }).collect(Collectors.toList());
    }
}
