package com.medicalsystem.eclinic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorAppointmentAvailabilityDTO {
    private int doctorId;
    private int appointmentId;

    private int patientId;
    private String patientName;

    private String doctorName;
    private Date date;
    private String time;
    private String hospitalName;


}
