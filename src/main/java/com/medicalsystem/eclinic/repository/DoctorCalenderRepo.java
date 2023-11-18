package com.medicalsystem.eclinic.repository;

import com.medicalsystem.eclinic.entity.Doctor;
import com.medicalsystem.eclinic.entity.DoctorCalender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface DoctorCalenderRepo extends JpaRepository<DoctorCalender,Integer> {


    @Query("from DoctorCalender d where d.doctor=?1 and d.date > NOW()")
    List<DoctorCalender> findAllAppointments(final Doctor doctorId);

}
