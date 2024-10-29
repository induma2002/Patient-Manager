package edu.icet.service;

import edu.icet.dto.MedicalReport;

import java.util.List;

public interface MedicalReportService {
    void addMedicalReport(MedicalReport medicalReport);

    MedicalReport getMedicalReportById(Integer id);

    List<MedicalReport> findByAdminId(Integer id);

    void deleteMedicalReportById(Integer id);

    List<MedicalReport> getAllMedicalReport();

    List<MedicalReport> finfByFkPatientId(Integer fkPatientId);
}
