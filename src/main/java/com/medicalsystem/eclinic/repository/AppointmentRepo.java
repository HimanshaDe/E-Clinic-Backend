package com.medicalsystem.eclinic.repository;

import com.medicalsystem.eclinic.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {


    List<Appointment> findAllByCalenderId(DoctorCalender doctorCalender);


    List<Appointment> findAllByDoctor(Doctor doctor);
    List<Appointment> findAllByPatientId(Patient patientId);
}
