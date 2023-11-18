package com.medicalsystem.eclinic.entity;

import javax.persistence.*;

@Entity
public class DoctorSpeciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_speciality_id",length = 45)
    private int doctor_speciality_id;

    @Column(name = "speciality_Type",length = 100, nullable=false)
    private String specialityType;


    @Column(name = "description",length = 1000,nullable = true)
    private String description;

    public DoctorSpeciality() {
    }

    public DoctorSpeciality(int doctor_speciality_id, String specialityType, String description) {
        this.doctor_speciality_id = doctor_speciality_id;
        this.specialityType = specialityType;
        this.description = description;
    }

    public int getDoctor_speciality_id() {
        return doctor_speciality_id;
    }

    public void setDoctor_speciality_id(int doctor_speciality_id) {
        this.doctor_speciality_id = doctor_speciality_id;
    }

    public String getSpecialityType() {
        return specialityType;
    }

    public void setSpecialityType(String specialityType) {
        this.specialityType = specialityType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DoctorSpeciality{" +
                "doctor_speciality_id=" + doctor_speciality_id +
                ", specialityType='" + specialityType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
