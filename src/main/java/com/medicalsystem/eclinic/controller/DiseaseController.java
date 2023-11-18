package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.DiseaseDTO;
import com.medicalsystem.eclinic.entity.Disease;
import com.medicalsystem.eclinic.entity.Doctor;
import com.medicalsystem.eclinic.service.DiseaseService;
import com.medicalsystem.eclinic.service.nlp.DetectedDisease;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/disease")
@CrossOrigin
public class DiseaseController {

    private final DiseaseService diseaseService;

    @Autowired
    public DiseaseController(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }

    @PostMapping
    public DiseaseDTO saveDisease(@RequestBody final DiseaseDTO diseaseDTO) {
        Disease disease = Disease.builder()
                .id(diseaseDTO.getId())
                .name(diseaseDTO.getName())
                .symptoms(diseaseDTO.getSymptoms())
                .doctors(diseaseDTO.getDoctors().stream().map(s -> Doctor.builder().doctorId(Integer.parseInt(s)).build()).collect(Collectors.toList()))
                .build();
        Disease savedDisease = diseaseService.crateDisease(disease);
        return buildDiseaseDTO(savedDisease);
    }

    public DiseaseDTO buildDiseaseDTO(final Disease disease) {
        return DiseaseDTO.builder()
                .id(disease.getId())
                .name(disease.getName())
                .symptoms(disease.getSymptoms())
                .build();
    }


    @PostMapping("/auto-detect")
    public List<DetectedDisease> detectDiseaseByText(@RequestBody final HashMap rawText) {
        return diseaseService.getDiseasesBySymptoms(rawText.get("text").toString());
    }
}
