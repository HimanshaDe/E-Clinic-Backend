package com.medicalsystem.eclinic.dto.request;

public class HomeInfoDTO {

    private int doctorCount;

    private int patientCount;
    private int hospitalCount;

    public HomeInfoDTO() {
    }

    public HomeInfoDTO(int doctorCount, int patientCount, int hospitalCount) {
        this.doctorCount = doctorCount;
        this.patientCount = patientCount;
        this.hospitalCount = hospitalCount;
    }

    public int getDoctorCount() {
        return doctorCount;
    }

    public void setDoctorCount(int doctorCount) {
        this.doctorCount = doctorCount;
    }

    public int getPatientCount() {
        return patientCount;
    }

    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }

    public int getHospitalCount() {
        return hospitalCount;
    }

    public void setHospitalCount(int hospitalCount) {
        this.hospitalCount = hospitalCount;
    }

    @Override
    public String toString() {
        return "HomeInfoDTO{" +
                "doctorCount=" + doctorCount +
                ", patientCount=" + patientCount +
                ", hospitalCount=" + hospitalCount +
                '}';
    }
}
