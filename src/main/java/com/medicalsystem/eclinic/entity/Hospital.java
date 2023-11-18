package com.medicalsystem.eclinic.entity;

import javax.persistence.*;

@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospital_id",length = 45)
    private int hospitalId;

    @Column(name = "Hospital_name", length = 200, nullable=false)
    private String hospitalName;

    @Column(name = "image_name", length = 100, nullable=false)
    private String imageName;

    @Column(name = "address",length = 250,nullable = false)
    private String address;



    public Hospital() {
    }

    public Hospital(int hospitalId, String hospitalName, String imageName, String address) {
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
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", imageName='" + imageName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
