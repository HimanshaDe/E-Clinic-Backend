package com.medicalsystem.eclinic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id",length = 45)
    private int appointmentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctorId")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patientId")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Patient patientId;
    @Column(name="patient_name",nullable=false)
    private String patient;
    @Column(name = "date", length = 10, nullable=false)
    private Date date;

    @Column(name="doctor_name")
    private String doctorName;

    @Column(name = "time", nullable=false)
    @JsonFormat(pattern = "HH:mm:ss")
    private String time;

    @Column(name="hospital_name")
    private String hospitalName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Calender_id")
    private DoctorCalender calenderId;
}
