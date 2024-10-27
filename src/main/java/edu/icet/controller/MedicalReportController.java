package edu.icet.controller;

import edu.icet.dto.MedicalReport;
import edu.icet.service.MedicalReportService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/medical-report")
@RequiredArgsConstructor
public class MedicalReportController {

    final MedicalReportService medicalReportService;

    @PostMapping("/add-medical-report")
    public void addPatient(@RequestBody MedicalReport medicalReport) {
        medicalReportService.addMedicalReport(medicalReport);
    }

    @GetMapping("/get-medical-report-by-id/{id}")
    public MedicalReport getPatientById(@PathVariable Integer id) {
        return medicalReportService.getMedicalReportById(id);
    }
    @GetMapping("/find-by-admin-id/{id}")
    public List<MedicalReport> findPatientByAdminId(@PathVariable Integer id) {
        return medicalReportService.findByAdminId(id);
    }
    @DeleteMapping("/delete-medical-report-by-id/{id}")
    public void deletePatientById(@PathVariable Integer id) {
        medicalReportService.deleteMedicalReportById(id);
    }
}
