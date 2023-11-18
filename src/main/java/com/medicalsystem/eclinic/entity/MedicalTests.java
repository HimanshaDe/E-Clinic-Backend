package com.medicalsystem.eclinic.entity;

import javax.persistence.*;

@Entity
public class MedicalTests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medical_test_id",length = 45)
    private int medicalTestId;

    @Column(name = "medical_test",length = 100, nullable=false)
    private String medicalTest;


    @Column(name = "description",length = 1000,nullable = true)
    private String description;

    public MedicalTests() {
    }

    public MedicalTests(int medicalTestId, String medicalTest, String description) {
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
        return "MedicalTests{" +
                "medicalTestId=" + medicalTestId +
                ", medicalTest='" + medicalTest + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
