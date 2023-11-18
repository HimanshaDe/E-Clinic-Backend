package com.medicalsystem.eclinic.service;


import com.medicalsystem.eclinic.entity.Disease;
import com.medicalsystem.eclinic.enums.Symptoms;
import com.medicalsystem.eclinic.repository.DiseaseRepository;
import com.medicalsystem.eclinic.service.nlp.AutomaticDiseaseDetectService;
import com.medicalsystem.eclinic.service.nlp.DetectedDisease;
import com.medicalsystem.eclinic.service.nlp.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DiseaseService {


  private final DiseaseRepository diseaseRepository;
  private final AutomaticDiseaseDetectService automaticDiseaseDetectService;

  @Autowired
  public DiseaseService(DiseaseRepository diseaseRepository,
    AutomaticDiseaseDetectService automaticDiseaseDetectService) {
    this.diseaseRepository = diseaseRepository;
    this.automaticDiseaseDetectService = automaticDiseaseDetectService;
  }

  public Disease crateDisease(final Disease disease) {
    return diseaseRepository.save(disease);
  }

  public List<DetectedDisease> getDiseasesBySymptoms(final String diseaseText) {
    List<Entity> detectedEntries = automaticDiseaseDetectService.getDetectedEntries(diseaseText);
    List<Symptoms> symptoms = detectedEntries.stream().map(entity -> {
      try {
        return Symptoms.valueOf(entity.getName());
      } catch (IllegalArgumentException e) {
        return null;
      }
    }).filter(Objects::nonNull).collect(Collectors.toList());
    return diseaseRepository.findDistinctAllBySymptomsIn(symptoms)
      .stream().map(disease -> DetectedDisease.builder().disease(disease)
        .detectedPercentage(getMatchingPercentage(disease,
          symptoms))
        .build()).collect(Collectors.toList());

  }

  public Double getMatchingPercentage(final Disease disease, final List<Symptoms> symptoms) {
    List<Symptoms> diseaseSymptoms = disease.getSymptoms();
    Double detectedSymptomsCount = Double.valueOf(diseaseSymptoms.stream().map(s -> symptoms.contains(s) ? 1 : 0).reduce(0,
      Integer::sum));
    return (detectedSymptomsCount / diseaseSymptoms.size()) * 100;
  }
}
