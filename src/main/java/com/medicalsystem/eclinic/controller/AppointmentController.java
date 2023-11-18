package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.*;
import com.medicalsystem.eclinic.entity.*;
import com.medicalsystem.eclinic.repository.AppointmentRepo;
import com.medicalsystem.eclinic.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/appointment")
@CrossOrigin
public class AppointmentController {

    @Autowired
    private AppointmentRepo appointmentRepo;
    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
public String saveAppointment(@RequestBody AppointmentDTO appointmentDTO){
String message = appointmentService.saveAppointment(appointmentDTO);

    return message;
}


    @GetMapping()
    public List<AppointmentDTO> getAllAppointments(){
        List<AppointmentDTO> allAppointments = appointmentService.getAllAppointments();
        return allAppointments;
    }

    @GetMapping(
            path = "/get-by-id/{id}"
    )
    public AppointmentDTO getDDoctorById(@PathVariable(value = "id") int doctor_id){
        AppointmentDTO appointmentDTO = appointmentService.getDoctorByAppointment(doctor_id);

        return  appointmentDTO;

    }

    @GetMapping("/available-doctor-appointments/{doctorId}")
    private List<DoctorAppointmentAvailabilityDTO> getAvailableAppointments(@PathVariable("doctorId") final Integer doctorId) {

        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
       return appointmentRepo.findAllByDoctor(doctor).stream().map(appointment -> {
           DoctorAppointmentAvailabilityDTO doctorAppointmentAvailabilityDTO = new DoctorAppointmentAvailabilityDTO();
           doctorAppointmentAvailabilityDTO.setAppointmentId(appointment.getAppointmentId());
            doctorAppointmentAvailabilityDTO.setDoctorName(appointment.getDoctorName());
           doctorAppointmentAvailabilityDTO.setPatientName(appointment.getPatient());
           doctorAppointmentAvailabilityDTO.setDate(appointment.getDate());
           doctorAppointmentAvailabilityDTO.setTime(appointment.getTime());
           doctorAppointmentAvailabilityDTO.setHospitalName(appointment.getHospitalName());


           return doctorAppointmentAvailabilityDTO;
       }).collect(Collectors.toList());
    }



    @GetMapping("/available-patient-appointments/{patientId}")
    private List<DoctorAppointmentAvailabilityDTO> getAvailablePAppointments(@PathVariable("patientId") final Integer patientId) {

            Patient patient = new Patient();
            patient.setPatientId(patientId);

        return appointmentRepo.findAllByPatientId(patient).stream().map(appointment -> {
            DoctorAppointmentAvailabilityDTO doctorAppointmentAvailabilityDTO = new DoctorAppointmentAvailabilityDTO();
            doctorAppointmentAvailabilityDTO.setAppointmentId(appointment.getAppointmentId());
            doctorAppointmentAvailabilityDTO.setDoctorName(appointment.getDoctorName());
            doctorAppointmentAvailabilityDTO.setPatientName(appointment.getPatient());
            doctorAppointmentAvailabilityDTO.setDate(appointment.getDate());
            doctorAppointmentAvailabilityDTO.setTime(appointment.getTime());
            doctorAppointmentAvailabilityDTO.setHospitalName(appointment.getHospitalName());


            return doctorAppointmentAvailabilityDTO;
        }).collect(Collectors.toList());
    }

}
