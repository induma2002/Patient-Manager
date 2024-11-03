package edu.icet.service;

import edu.icet.dto.Appoinment;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AppoinmentService {
    void addAppoinment(Appoinment appoinment);

    Appoinment findById(Integer id);

    void deletById(Integer id);

    List<Appoinment> getAllAppointment();
}
