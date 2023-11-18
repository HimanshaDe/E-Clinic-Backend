package com.medicalsystem.eclinic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorAvailabilityDTO {

    private int calenderId;
    private int doctorId;

    private String doctorName;

    private String time;
    private Date date;
    private String hospitalName;

    private String nextAppointmentTime;

    private Integer appointmentCount;
    private int number_of_patients;
}
