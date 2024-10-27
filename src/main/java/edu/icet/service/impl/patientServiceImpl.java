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
    final ModelMapper modelMapper;


    @Override
    public List<Patient> getPatient() {
        List<Patient> patientList = new ArrayList<>();
        patientRepository.findAll().forEach(patientEntity -> patientList.add(modelMapper.map(patientEntity, Patient.class)));
        return patientList;
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(modelMapper.map(patient, PatientEntity.class));

    }

    @Override
    public void deleteById(Integer id) {
        patientRepository.deleteById(id);
    }

    @Override
    public Patient getPatientByid(Integer id) {
        return modelMapper.map(patientRepository.findById(id), Patient.class);
    }

    @Override
    public List<Patient> findPatientByName(String name) {

        List<Patient> patientList = new ArrayList<>();
        patientRepository.findByName(name).forEach(patientEntity -> {
            patientList.add(modelMapper.map(patientEntity, Patient.class));
        });
        return patientList;
    }

    @Override
    public List<Patient> findPatientByContact(String contact) {
        List<Patient> patientList = new ArrayList<>();
        patientRepository.findByContact(contact).forEach(patientEntity -> {
            patientList.add(modelMapper.map(patientEntity, Patient.class));
        });
        return patientList;
    }

    @Override
    public List<Patient> findPatientByNic(String nic) {
        List<Patient> patientList = new ArrayList<>();
        patientRepository.findByNic(nic).forEach(patientEntity -> {
            patientList.add(modelMapper.map(patientEntity, Patient.class));
        });
        return patientList;
    }
}