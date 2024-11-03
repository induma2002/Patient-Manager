package edu.icet.service.impl;

import edu.icet.dto.Appoinment;
import edu.icet.entity.AppoinmentEntity;
import edu.icet.repository.AppoinmentRepository;
import edu.icet.service.AppoinmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppoinmentServiceImpl implements AppoinmentService {
    private final AppoinmentRepository appoinmentRepository;
    private final ModelMapper modelMapper;
    @Override
    public void addAppoinment(Appoinment appoinment) {
        appoinmentRepository.save(modelMapper.map(appoinment, AppoinmentEntity.class));
    }

    @Override
    public Appoinment findById(Integer id) {
        return modelMapper.map(appoinmentRepository.findById(id), Appoinment.class);
    }

    @Override
    public void deletById(Integer id) {
        appoinmentRepository.deleteById(id);
    }

    @Override
    public List<Appoinment> getAllAppointment() {
        List<Appoinment> appoinments = new ArrayList<>();
        appoinmentRepository.findAll().forEach(appointment ->{
            appoinments.add(modelMapper.map(appointment,Appoinment.class));
        });
        return appoinments;
    }

}
