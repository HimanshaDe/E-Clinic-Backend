package com.medicalsystem.eclinic.dto.request;

public class DoctorUpdateDTO {

    private int doctorId;
    private String doctorName;
    private String nic;
    private int contact;
    private String email;
    private String imageName;
    private String username;
    private String password;

    private boolean activeStatus;

    public DoctorUpdateDTO() {
    }

    public DoctorUpdateDTO(int doctorId, String doctorName, String nic, int contact, String email, String imageName, String username, String password, boolean activeStatus) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.nic = nic;
        this.contact = contact;
        this.email = email;
        this.imageName = imageName;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
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
        return "DoctorUpdateDTO{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", nic='" + nic + '\'' +
                ", contact=" + contact +
                ", email='" + email + '\'' +
                ", imageName='" + imageName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
