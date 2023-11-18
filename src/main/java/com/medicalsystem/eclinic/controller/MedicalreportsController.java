package com.medicalsystem.eclinic.controller;


import com.medicalsystem.eclinic.dto.DoctorAvailabilityDTO;
import com.medicalsystem.eclinic.dto.MedicalReportDTO;
import com.medicalsystem.eclinic.dto.ReportDTO;
import com.medicalsystem.eclinic.entity.MedicalReport;
import com.medicalsystem.eclinic.repository.MedicalReportRepo;
import com.medicalsystem.eclinic.service.MedicalreportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/medical_reports")
@CrossOrigin
public class MedicalreportsController {

    @Autowired
    private MedicalreportService medicalreportService;

    @PostMapping
    public String saveMedicalReports(@RequestBody MedicalReportDTO medicalReportDTO){
        String message= medicalreportService.saveMedicalReports(medicalReportDTO);
        return message;
    }
    @GetMapping("/{patientId}")
    private List<ReportDTO> getAllReportsByPatient(@PathVariable("patientId") final Integer patientId){
        List<MedicalReport> reports = medicalreportService.getAllReportsBypatient(patientId);

        return reports.stream().map(medicalReport -> {
            ReportDTO reportDTO = new ReportDTO();
            reportDTO.setPatientId(medicalReport.getPatient().getPatientId());
            reportDTO.setFileName(medicalReport.getFileName());
            reportDTO.setMedicleTestType(medicalReport.getMedicleTestType());
            reportDTO.setDate(medicalReport.getDate());
            reportDTO.setFile(medicalReport.getFile());

            return reportDTO;
        }).collect(Collectors.toList());
    }

}
