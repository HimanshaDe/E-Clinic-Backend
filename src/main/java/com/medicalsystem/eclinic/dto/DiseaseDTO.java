package com.medicalsystem.eclinic.dto;

import com.medicalsystem.eclinic.enums.Symptoms;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiseaseDTO {
    private Integer id;
    private String name;
    private List<Symptoms> symptoms;

    @Builder.Default
    private List<String> doctors = new ArrayList<>();
}
