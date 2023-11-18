package com.medicalsystem.eclinic.repository;

import com.medicalsystem.eclinic.entity.DoctorSpeciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DoctorSpecialityRepo extends JpaRepository<DoctorSpeciality,Integer> {
}
