package edu.icet.service.impl;

import edu.icet.dto.MedicalReport;
import edu.icet.entity.MedicalReportEntity;
import edu.icet.repository.MedicalReportRepository;
import edu.icet.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MedicalReporrtServiceImpl implements MedicalReportService {
    final MedicalReportRepository medicalReportRepository;
    final ModelMapper modelMapper;
    @Override
    public void addMedicalReport(MedicalReport medicalReport) {
        log.info(medicalReport.toString());
        medicalReportRepository.save(modelMapper.map(medicalReport, MedicalReportEntity.class));
    }

    @Override
    public MedicalReport getMedicalReportById(Integer id) {
        return modelMapper.map(medicalReportRepository.findById(id), MedicalReport.class);
    }

    @Override
    public List<MedicalReport> findByAdminId(Integer id) {
        List<MedicalReport> medicalReports = new ArrayList<>();
        medicalReportRepository.findByAdminId(id).forEach(report ->{
            medicalReports.add(modelMapper.map(report, MedicalReport.class));
        });
        return medicalReports;
    }

    @Override
    public void deleteMedicalReportById(Integer id) {
        medicalReportRepository.deleteById(id);
    }

    @Override
    public List<MedicalReport> getAllMedicalReport() {
        List<MedicalReport> medicalReports = new ArrayList<>();
        medicalReportRepository.findAll().forEach(report ->{
            medicalReports.add(modelMapper.map(report, MedicalReport.class));
        });
        return medicalReports;
    }

    @Override
    public List<MedicalReport> finfByFkPatientId(Integer fkPatientId) {
        List<MedicalReport> medicalReports = new ArrayList<>();
        medicalReportRepository.findByPatientId(fkPatientId).forEach(report ->{
            medicalReports.add(modelMapper.map(report, MedicalReport.class));
        });
        return medicalReports;
    }
}
