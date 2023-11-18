package com.medicalsystem.eclinic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorCalender {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int calenderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctorId")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Doctor doctor;

    @Column(name = "time", nullable=false)
    @JsonFormat(pattern = "HH:mm:ss")
    private String time;

    @Column(name = "number_of_patients",length = 10, nullable=false)
    private int number_of_patients;

    @Column(name = "date")
    private Date date;

    @Column(name = "Hospital_name", length = 200, nullable=false)
    private String hospitalName;
}
