package edu.icet.controller;

import edu.icet.dto.Patient;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
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

    @GetMapping("/get-patient-by-/{id}")// Get Patient Using ID
    public Patient getPatientById(@PathVariable Integer id){
        return patientService.getPatientByid(id);
    }

    @GetMapping("/find-by-name/{name}")// Find Patients Using Name
    public List<Patient> findPatientByName(@PathVariable String name){
        return patientService.findPatientByName(name);
    }

    @GetMapping("/find-by-contact/{contact}")// Find Patients Using Contact
    public List<Patient> findPatientByContact(@PathVariable String contact){
        return patientService.findPatientByContact(contact);
    }

    @GetMapping("/find-patient-by-nic/{nic}")// // Find Patients Using Nic
    public List<Patient> findPatientByNic(@PathVariable String nic){
       return patientService.findPatientByNic(nic);
    }


}
