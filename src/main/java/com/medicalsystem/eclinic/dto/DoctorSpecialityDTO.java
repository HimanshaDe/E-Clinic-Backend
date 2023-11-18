package com.medicalsystem.eclinic.dto;

public class DoctorSpecialityDTO {

    private int doctor_speciality_id;

    private String specialityType;

    private String description;

    public DoctorSpecialityDTO() {
    }

    public DoctorSpecialityDTO(int doctor_speciality_id, String specialityType, String description) {
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
        return "DoctorSpecialityDTO{" +
                "doctor_speciality_id=" + doctor_speciality_id +
                ", specialityType='" + specialityType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
