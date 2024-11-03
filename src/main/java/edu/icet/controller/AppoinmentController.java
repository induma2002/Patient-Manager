package edu.icet.controller;

import edu.icet.dto.Appoinment;
import edu.icet.service.AppoinmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")

@RequiredArgsConstructor
public class AppoinmentController {

    final AppoinmentService appoinmentService;

    @PostMapping("/add")//Add appointment
    public void addAppointment(@RequestBody Appoinment appoinment) {
        System.out.println(appoinment);
        appoinmentService.addAppoinment(appoinment);
    }

    @GetMapping("/search-by-id/{id}") // Search by ID
    public Appoinment getAppointmentById(@PathVariable Integer id) {
        return appoinmentService.findById(id);
    }

    @DeleteMapping("/delete/{id}")//Delete By ID
    public void deleteAppointment(@PathVariable Integer id) {
        appoinmentService.deletById(id);
    }

    @GetMapping("/get-all")// Get All Appointment
    public List<Appoinment> getAllAppointments() {
        return appoinmentService.getAllAppointment();
    }
    @PutMapping("/update")
    public void updateAppointment(@RequestBody Appoinment appoinment) {
        appoinmentService.addAppoinment(appoinment);
    }
}
