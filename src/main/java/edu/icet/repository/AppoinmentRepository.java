package edu.icet.repository;

import edu.icet.entity.AppoinmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoinmentRepository extends JpaRepository<AppoinmentEntity, Integer> {
}
