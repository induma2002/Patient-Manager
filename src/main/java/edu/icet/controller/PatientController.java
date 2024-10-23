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

    @GetMapping("/get-all-patient")
    public List <Patient> getPatient() {
        return patientService.getPatient();
    }

    @PostMapping("/add-patient")
    public void addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }

    @DeleteMapping("delete-by-id/{id}")
    public void deletePatient(@PathVariable Integer id){
        patientService.deleteById(id);
    }
    @PutMapping("/update-patient")
    public void updatePatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }

}
