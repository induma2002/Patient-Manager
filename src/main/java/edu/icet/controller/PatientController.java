package edu.icet.controller;

import edu.icet.dto.Patient;
import edu.icet.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/get-all-patient")
    public List <Patient> getPatient() {
        return patientService.getPatient();
    }

    @PostMapping("/add-patient")
    public void addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }
}
