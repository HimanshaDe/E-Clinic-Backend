package com.medicalsystem.eclinic.dto;

import javax.persistence.Column;

public class AdminDTO {

    private int adminID;

    private String adminUserName;

    private String password;

    public AdminDTO() {
    }

    public AdminDTO(int adminID, String adminUserName, String password) {
        this.adminID = adminID;
        this.adminUserName = adminUserName;
        this.password = password;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = password;
    }

    public String toString() {
        return "AdminDTO{" +
                "adminID=" + adminID +
                ", adminUserName='" + adminUserName + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }
}
