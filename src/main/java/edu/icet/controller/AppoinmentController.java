package edu.icet.controller;

import edu.icet.dto.Appoinment;
import edu.icet.service.AppoinmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")

@RequiredArgsConstructor
public class AppoinmentController {

    final AppoinmentService appoinmentService;

    @PostMapping("/add")
    public void addAppoinment(@RequestBody Appoinment appoinment) {
        appoinmentService.addAppoinment(appoinment);
    }
}
