package com.medicalsystem.eclinic.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@TypeDefs({
//        @TypeDef(name = "json", typeClass = JsonType.class)
//})
@Builder


public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id",length = 45)
    private int doctorId;

    @Column(name = "doctor_name",length = 100, nullable=false)
    private String doctorName;

    @Column(name = "birth_day", length = 10, nullable=false)
    private Date birthDate;

    @Column(name = "nic",length = 12,nullable = false)
    private String nic;

    @Column(name = "contact_number", length = 10,nullable=false)
    private int contact;

    @Column(name = "email", length = 100, nullable = false)
    private String email;


    @Column(name = "qualifications", length = 300, nullable = false)
    private String qualifications;
    @Column(name = "gender", length = 10, nullable=false)
    private String gender;

    @Column(columnDefinition = "TEXT", name = "image_name",  nullable=false)
    private String imageName;
    @Column(name = "speciality", length =100, nullable=false)
    private String speciality;
    @Column(name = "date_of_join")
    private Date doj;

    @Column(name = "username", length =50, nullable=false)
    private String username;

    @Column(name = "password",length =50, nullable=false)
    private String password;

    @Column(name = "active_status",columnDefinition = "TINYINT default 1")
    private boolean activeStatus;


}
