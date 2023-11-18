package com.medicalsystem.eclinic.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.medicalsystem.eclinic.entity.Doctor;
import com.medicalsystem.eclinic.entity.DoctorCalender;
import com.medicalsystem.eclinic.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {

    private int appointmentId;

    private String patientName;

    private Date date;

private  int patientId;
    private int doctorId;

    private String doctorName;
    private String time;


    private String hospitalName;


    private int calenderId;


    public AppointmentDTO(int appointmentId, String patient, Date date, String doctorName, String time, String hospitalName, DoctorCalender calenderId) {
    }

    public AppointmentDTO(int appointmentId, String patient, Date date, String time, String hospitalName) {
    }

    public AppointmentDTO(int appointmentId, String patient, Date date, Doctor doctor, String time, String hospitalName, DoctorCalender calenderId) {
    }
}
