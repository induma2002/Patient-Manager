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

    @PostMapping("/add")
    public void addMedicalReport(@RequestBody MedicalReport medicalReport) {
        medicalReportService.addMedicalReport(medicalReport);
    }

    @GetMapping("/get-by-id/{id}")
    public MedicalReport getMedicalReportById(@PathVariable Integer id) {
        return medicalReportService.getMedicalReportById(id);
    }

    @GetMapping("/find-by-admin-id/{id}")
    public List<MedicalReport> findMedicalReportByAdminId(@PathVariable Integer id) {
        return medicalReportService.findByAdminId(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteMedicalReportById(@PathVariable Integer id) {
        medicalReportService.deleteMedicalReportById(id);
    }

    @GetMapping("/get-all")
    public List<MedicalReport> getAllMedicalReport() {
        return medicalReportService.getAllMedicalReport();
    }
    @GetMapping("/find-by-fkPatientId/{fkPatientId}")
    public List<MedicalReport> findPatientByFkPatientId(@PathVariable Integer fkPatientId) {
        return medicalReportService.finfByFkPatientId(fkPatientId);
    }

}
