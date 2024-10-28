package edu.icet.repository;

import edu.icet.dto.Patient;
import edu.icet.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {
    List<PatientEntity> findByName(String name);
    List<PatientEntity> findByContact(String name);
    List<PatientEntity> findByNic(String name);
}
