package edu.icet.repository;

import edu.icet.dto.Patient;
import edu.icet.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {
    List<Patient> findByName(String name);
    List<Patient> findByContact(String name);
    List<Patient> findByNic(String name);
}
