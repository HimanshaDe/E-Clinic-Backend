package com.medicalsystem.eclinic.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id",length = 45)
    private int patientId;

    @Column(name = "patient_name",length = 100, nullable=false)
    private String patientName;

    @Column(name = "birth_day", length = 10, nullable=false)
    private Date birthDate;


    @Column(name = "nic",length = 12,nullable = false)
    private String nic;
    @Column(name = "contact_number", length = 10,nullable=false)
    private int contact;

    @Column(name = "address", length = 200, nullable = false)
    private String address;

    @Column(name = "email", length = 100, nullable = false)
    private String email;


    @Column(name = "gender", length = 10, nullable=false)
    private String gender;

    @Column(name = "date_of_join")
    private Date doj;

    @Column(name = "username", length =50, nullable=false)
    private String username;

    @Column(name = "password",length =50, nullable=false)
    private String password;

    public Patient() {
    }

    public Patient(int patientId, String patientName, Date birthDate, String nic, int contact, String address, String email, String gender, Date doj, String username, String password) {
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
        return "Patient{" +
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
