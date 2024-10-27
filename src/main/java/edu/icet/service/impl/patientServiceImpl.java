package edu.icet.service.impl;

import edu.icet.dto.Patient;
import edu.icet.entity.PatientEntity;
import edu.icet.repository.PatientRepository;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class patientServiceImpl implements PatientService {

    final PatientRepository patientRepository;
    final ModelMapper mapper;
    private final ModelMapper modelMapper;


    List<Patient> patientList;

    @Override
    public List <Patient> getPatient() {
        patientList = new ArrayList<>();
        patientRepository.findAll().forEach(patientEntity -> patientList.add(mapper.map(patientEntity, Patient.class)));
        return patientList;
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(mapper.map(patient, PatientEntity.class));

    }

    @Override
    public void deleteById(Integer id) {
        patientRepository.deleteById(id);
    }

    @Override
    public Patient getPatientByid(Integer id) {
        return modelMapper.map(patientRepository.findById(id), Patient.class);
    }
}
