package com.medicalsystem.eclinic.repository;

import com.medicalsystem.eclinic.entity.Disease;
import com.medicalsystem.eclinic.enums.Symptoms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface DiseaseRepository extends JpaRepository<Disease, Integer> {

    List<Disease> findDistinctAllBySymptomsIn(List<Symptoms> symptoms);
}
