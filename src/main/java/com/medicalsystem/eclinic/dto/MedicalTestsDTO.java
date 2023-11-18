package com.medicalsystem.eclinic.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MedicalTestsDTO {

    private int medicalTestId;

    private String medicalTest;

    private String description;

    public MedicalTestsDTO() {

    }

    public MedicalTestsDTO(int medicalTestId, String medicalTest, String description) {
        this.medicalTestId = medicalTestId;
        this.medicalTest = medicalTest;
        this.description = description;
    }

    public int getMedicalTestId() {
        return medicalTestId;
    }

    public void setMedicalTestId(int medicalTestId) {
        this.medicalTestId = medicalTestId;
    }

    public String getMedicalTest() {
        return medicalTest;
    }

    public void setMedicalTest(String medicalTest) {
        this.medicalTest = medicalTest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MedicalTestsDTO{" +
                "medicalTestId=" + medicalTestId +
                ", medicalTest='" + medicalTest + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
