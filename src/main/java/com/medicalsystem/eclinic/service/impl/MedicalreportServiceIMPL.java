package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.MedicalReportDTO;
import com.medicalsystem.eclinic.dto.ReportDTO;
import com.medicalsystem.eclinic.entity.MedicalReport;
import com.medicalsystem.eclinic.entity.Patient;
import com.medicalsystem.eclinic.repository.MedicalReportRepo;
import com.medicalsystem.eclinic.repository.MedicalTestsRepo;
import com.medicalsystem.eclinic.service.MedicalreportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalreportServiceIMPL implements MedicalreportService {

    @Autowired
    MedicalReportRepo medicalReportRepo;

    @Override
    public String saveMedicalReports(MedicalReportDTO medicalReportDTO) {
        Patient patient = new Patient();
        patient.setPatientId(medicalReportDTO.getPatientId());
        MedicalReport medicalReport = new MedicalReport(
                medicalReportDTO.getReportId(), patient, medicalReportDTO.getDate(), medicalReportDTO.getMedicleTestType(), medicalReportDTO.getFileName(),medicalReportDTO.getFile()
                );
        System.out.println(medicalReportDTO.getReportId());
        medicalReportRepo.save(medicalReport);
        return null;
    }

    @Override
    public List<MedicalReport> getAllReportsBypatient(Integer patientId) {
        Patient patient=new Patient();
        patient.setPatientId(patientId);

        return medicalReportRepo.findAllByPatient(patient);
    }


}
