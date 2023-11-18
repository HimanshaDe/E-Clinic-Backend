package com.medicalsystem.eclinic.repository;

import com.medicalsystem.eclinic.entity.Admin;
import com.medicalsystem.eclinic.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface DoctorRepo extends JpaRepository<Doctor,Integer> {

    Optional<Doctor> findByUsernameAndPassword(final String username, final String password);

}
