package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.AppointmentDTO;
import com.medicalsystem.eclinic.entity.Appointment;
import com.medicalsystem.eclinic.entity.Doctor;
import com.medicalsystem.eclinic.entity.DoctorCalender;
import com.medicalsystem.eclinic.entity.Patient;
import com.medicalsystem.eclinic.repository.AppointmentRepo;
import com.medicalsystem.eclinic.repository.DoctorCalenderRepo;
import com.medicalsystem.eclinic.repository.DoctorRepo;
import com.medicalsystem.eclinic.repository.PatientRepo;
import com.medicalsystem.eclinic.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceIMPL implements AppointmentService {


    private final AppointmentRepo appointmentRepo;
    private final DoctorRepo doctorRepo;
    private final EmailService emailService;
    private final DoctorCalenderRepo doctorCalenderRepo;
    private final PatientRepo patientRepo;

    @Autowired
    public AppointmentServiceIMPL(AppointmentRepo appointmentRepo, DoctorRepo doctorRepo, EmailService emailService, DoctorCalenderRepo doctorCalenderRepo, PatientRepo patientRepo) {
        this.appointmentRepo = appointmentRepo;
        this.doctorRepo = doctorRepo;
        this.emailService = emailService;
        this.doctorCalenderRepo = doctorCalenderRepo;
        this.patientRepo = patientRepo;
    }


    @Override
    public String saveAppointment(AppointmentDTO appointmentDTO) {
        DoctorCalender doctorCalender = doctorCalenderRepo.findById(appointmentDTO.getCalenderId()).get();
        doctorCalender.setCalenderId(appointmentDTO.getCalenderId());
        Optional<Doctor> optionalDoctor = doctorRepo.findById(appointmentDTO.getDoctorId());
        Patient patient = patientRepo.findById(appointmentDTO.getPatientId()).get();

        Doctor doctor = optionalDoctor.get();

        Appointment appointment = Appointment.builder()
                .date(appointmentDTO.getDate())
                .calenderId(doctorCalender)
                .time(appointmentDTO.getTime())
                .patient(appointmentDTO.getPatientName())
                .patientId(patient)
                .hospitalName(appointmentDTO.getHospitalName())
                .doctorName(doctor.getDoctorName())
                .doctor(doctor)
                .build();



        emailService.sendEmail(patient.getEmail(), "<html>Hello Your Appointment is confirmed <div> <strong> Your Name : </strong>"+appointmentDTO.getPatientName() +" </div>" +
                "<div> <strong> Doctor Name : </strong>Dr."+doctor.getDoctorName() +" </div>" +
                "<div> <strong> Date : </strong>"+appointmentDTO.getDate() +" </div>" +
                "<div> <strong> Time : </strong>"+appointmentDTO.getTime() +" </div>"+
                "</html>");


//        appointmentRepo.save(appointment);
        return "save";

    }

    public List<AppointmentDTO> getAllAppointments() {

        List<Appointment> getAllAppointments = appointmentRepo.findAll();

        List <AppointmentDTO> appointmentDTOList = new ArrayList<>();

        for (Appointment appointment : getAllAppointments){
            AppointmentDTO appointmentDTO = new AppointmentDTO(

            );
            appointmentDTO.setAppointmentId(appointment.getAppointmentId());
            appointmentDTO.setDoctorName(appointment.getDoctorName());
            appointmentDTO.setPatientName(appointment.getPatient());
            appointmentDTO.setDate(appointment.getDate());
            appointmentDTO.setTime(appointment.getTime());
            appointmentDTO.setHospitalName(appointment.getHospitalName());



            appointmentDTOList.add(appointmentDTO);

        }
        return appointmentDTOList;

    }

    @Override
    public AppointmentDTO getDoctorById(int doctorId) {
        return null;
    }

    @Override
    public AppointmentDTO getDoctorByAppointment(int doctorId) {
        if(appointmentRepo.existsById(doctorId)){

            Appointment appointment =appointmentRepo.getReferenceById((doctorId));
            AppointmentDTO appointmentDTO =new AppointmentDTO(
                    appointment.getAppointmentId(),appointment.getPatient(),appointment.getDate(),appointment.getDoctorName(),
                    appointment.getTime(),appointment.getHospitalName(),appointment.getCalenderId());
            return appointmentDTO;
        }else{
            throw new RuntimeException("No");
        }

    }
}
