package com.medicalsystem.eclinic.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class PatientDTO {

    private int patientId;

    private String patientName;

    private Date birthDate;

    private String nic;

    private int contact;

    private String address;

    private String email;

    private String gender;

    private Date doj;

    private String username;

    private String password;

    public PatientDTO() {
    }

    public PatientDTO(int patientId, String patientName, Date birthDate, String nic, int contact, String address, String email, String gender, Date doj, String username, String password) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.birthDate = birthDate;
        this.nic = nic;
        this.contact = contact;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.doj = doj;
        this.username = username;
        this.password = password;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "PatientDTO{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", birthDate=" + birthDate +
                ", nic='" + nic + '\'' +
                ", contact=" + contact +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", doj=" + doj +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
