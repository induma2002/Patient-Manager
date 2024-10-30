package edu.icet.repository;

import edu.icet.entity.ApoimentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoinmentRepository extends JpaRepository<ApoimentEntity, Integer> {
}
