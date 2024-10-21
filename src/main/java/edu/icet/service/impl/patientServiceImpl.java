package edu.icet.service.impl;

import edu.icet.dto.Patient;
import edu.icet.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class patientServiceImpl implements PatientService {

    List<Patient> patientList = new ArrayList<>();

    @Override
    public List <Patient> getPatient() {
        return patientList;
    }

    @Override
    public void addPatient(Patient patient) {
        patientList.add(patient);
    }
}
