package com.medicalsystem.eclinic.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class MedicalReport {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id",length = 45)
    private int reportId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patientId")
    private Patient patient;

    @Column(name = "date", length = 10, nullable=false)
    private Date date;

    @Column(name="medicle_test_type", length = 200, nullable = false)
    private String medicleTestType;

   @Lob
    @Column(name="file_name", nullable=false)
    private String fileName;

    @Lob
    @Column(name="file")
    private String file;

    public MedicalReport() {
    }

    public MedicalReport(int reportId, Patient patient, Date date, String medicleTestType, String fileName, String file) {
        this.reportId = reportId;
        this.patient = patient;
        this.date = date;
        this.medicleTestType = medicleTestType;
        this.fileName = fileName;
        this.file = file;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMedicleTestType() {
        return medicleTestType;
    }

    public void setMedicleTestType(String medicleTestType) {
        this.medicleTestType = medicleTestType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "MedicalReport{" +
                "reportId=" + reportId +
                ", patient=" + patient +
                ", date=" + date +
                ", medicleTestType='" + medicleTestType + '\'' +
                ", fileName='" + fileName + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}
