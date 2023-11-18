package com.medicalsystem.eclinic.dto;

import com.medicalsystem.eclinic.entity.Doctor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class DoctorCalenderDTO {

    private int calenderId;

    private int doctorId;

    private String time;
    private Date date;
    private int number_of_patients;

    private String hospitalName;


    public DoctorCalenderDTO() {
    }

    public DoctorCalenderDTO(int calenderId, int doctorId, String time, Date date, int number_of_patients, String hospitalName) {
        this.calenderId = calenderId;
        this.doctorId = doctorId;
        this.time = time;
        this.date = date;
        this.number_of_patients = number_of_patients;
        this.hospitalName = hospitalName;
    }

    public int getCalenderId() {
        return calenderId;
    }

    public void setCalenderId(int calenderId) {
        this.calenderId = calenderId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumber_of_patients() {
        return number_of_patients;
    }

    public void setNumber_of_patients(int number_of_patients) {
        this.number_of_patients = number_of_patients;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "DoctorCalenderDTO{" +
                "calenderId=" + calenderId +
                ", doctorId=" + doctorId +
                ", time='" + time + '\'' +
                ", date=" + date +
                ", number_of_patients=" + number_of_patients +
                ", hospitalName='" + hospitalName + '\'' +
                '}';
    }
}
