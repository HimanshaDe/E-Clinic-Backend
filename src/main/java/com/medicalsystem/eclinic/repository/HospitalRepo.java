package com.medicalsystem.eclinic.repository;

import com.medicalsystem.eclinic.entity.Hospital;
import com.medicalsystem.eclinic.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface HospitalRepo extends JpaRepository<Hospital,Integer>  {


}
