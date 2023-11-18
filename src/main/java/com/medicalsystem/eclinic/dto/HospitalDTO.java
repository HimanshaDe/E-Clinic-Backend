package com.medicalsystem.eclinic.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class HospitalDTO {


    private int hospitalId;

    private String hospitalName;

    private String imageName;

    private String address;




    public HospitalDTO() {
    }

    public HospitalDTO(int hospitalId, String hospitalName, String imageName, String address) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.imageName = imageName;
        this.address = address;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "HospitalDTO{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", imageName='" + imageName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
