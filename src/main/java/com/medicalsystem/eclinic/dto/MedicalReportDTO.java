package com.medicalsystem.eclinic.dto;

import com.medicalsystem.eclinic.entity.Patient;

import javax.persistence.*;
import java.util.Date;

public class MedicalReportDTO {


    private int reportId;

    private int patientId;

    private Date date;

    private String medicleTestType;

    private String fileName;

    private String file;

    public MedicalReportDTO() {
    }

    public MedicalReportDTO(int reportId, int patientId, Date date, String medicleTestType, String fileName, String file) {
        this.reportId = reportId;
        this.patientId = patientId;
        this.date = date;
        this.medicleTestType = medicleTestType;
        this.fileName = fileName;
        this.file = file;
    }

    public MedicalReportDTO(int reportId, Patient patient, Date date, String medicleTestType, String fileName, String file) {
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMedicleTestType() {
        return medicleTestType;
    }

    public void setMedicleTestType(String medicleTestType) {
        this.medicleTestType = medicleTestType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "MedicalReportDTO{" +
                "reportId=" + reportId +
                ", patientId=" + patientId +
                ", date=" + date +
                ", medicleTestType='" + medicleTestType + '\'' +
                ", fileName='" + fileName + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}


