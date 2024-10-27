package edu.icet.service;

import edu.icet.dto.Patient;

import java.util.List;

public interface PatientService {
    List <Patient> getPatient();
    void addPatient(Patient patient);

    void deleteById(Integer id);

    Patient getPatientByid(Integer id);

    List<Patient> findPatientByName(String name);

    List<Patient> findPatientByContact(String contact);

    List<Patient> findPatientByNic(String nic);
}
