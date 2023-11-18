package com.medicalsystem.eclinic.dto;

import java.util.Date;

public class DoctorDTO {

    private int doctorId;
    private String doctorName;
    private Date birthDate;
    private String nic;
    private int contact;
    private String email;
    private String gender;
    private String imageName;
    private String speciality;

    private String qualifications;
    private Date doj;
    private String username;
    private String password;
    private boolean activeStatus;

    public DoctorDTO() {
    }

    public DoctorDTO(int doctorId, String doctorName, Date birthDate, String nic, int contact, String email, String gender, String imageName, String speciality, String qualifications, Date doj, String username, String password, boolean activeStatus) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.birthDate = birthDate;
        this.nic = nic;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.imageName = imageName;
        this.speciality = speciality;
        this.qualifications = qualifications;
        this.doj = doj;
        this.username = username;
        this.password = password;
        this.activeStatus = activeStatus;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "DoctorDTO{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", birthDate=" + birthDate +
                ", nic='" + nic + '\'' +
                ", contact=" + contact +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", imageName='" + imageName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", doj=" + doj +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
