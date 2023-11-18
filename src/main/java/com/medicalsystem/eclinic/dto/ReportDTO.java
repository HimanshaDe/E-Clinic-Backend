package com.medicalsystem.eclinic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportDTO {

    private int patientId;

    private Date date;

    private String medicleTestType;

    private String fileName;

    private String file;

}
