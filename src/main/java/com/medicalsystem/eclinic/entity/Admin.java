package com.medicalsystem.eclinic.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id",length = 45)
    private int adminID;

    @Column(name = "username",length = 100, nullable=false)
    private String adminUserName;

    @Column(name = "password", length = 50, nullable=false)
    private String password;

    public Admin() {
    }

    public Admin(int adminID, String adminUserName, String password) {
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

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", adminUserName='" + adminUserName + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }
}
