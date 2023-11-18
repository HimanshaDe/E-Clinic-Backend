package com.medicalsystem.eclinic.repository;

import com.medicalsystem.eclinic.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface PatientRepo extends JpaRepository<Patient,Integer> {


    Optional<Patient> findByUsernameAndPassword(final String username,final String password);
}
