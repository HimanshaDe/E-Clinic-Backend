package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.MedicalReportDTO;
import com.medicalsystem.eclinic.dto.ReportDTO;
import com.medicalsystem.eclinic.entity.MedicalReport;

import java.util.List;

public interface MedicalreportService {
    String saveMedicalReports(MedicalReportDTO medicalReportDTO);


    List<MedicalReport> getAllReportsBypatient(Integer patientId);
}
