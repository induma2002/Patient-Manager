package edu.icet.controller;

import edu.icet.dto.Patient;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PatientController {

    final PatientService patientService;

    @GetMapping("/get-all-patient")// Get All Patient
    public List <Patient> getPatient() {
        return patientService.getPatient();
    }

    @PostMapping("/add-patient")// Add patient
    public void addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }

    @DeleteMapping("delete-by-id/{id}")// Delete Patient Using ID
    public void deletePatient(@PathVariable Integer id){
        patientService.deleteById(id);
    }
    @PutMapping("/update-patient")// Update Patient
    public void updatePatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }
    @GetMapping("/get-patient-by-/{id}")
    public Patient getPatientById(@PathVariable Integer id){
        return patientService.getPatientByid(id);
    }


}
