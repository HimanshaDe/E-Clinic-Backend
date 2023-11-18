package com.medicalsystem.eclinic.dto.request;

public class DoctorLoginDTO {

    private String username;
    private String password;

    public DoctorLoginDTO(String username) {
        this.username = username;
    }

    public DoctorLoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
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
        return "DoctorLoginDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
