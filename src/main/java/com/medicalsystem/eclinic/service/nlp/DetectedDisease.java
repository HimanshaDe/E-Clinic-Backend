package com.medicalsystem.eclinic.service.nlp;

import com.medicalsystem.eclinic.entity.Disease;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetectedDisease {

    Disease disease;
    Double detectedPercentage;

}
