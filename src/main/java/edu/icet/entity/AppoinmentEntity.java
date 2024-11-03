package edu.icet.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "appoinment")
public class AppoinmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String qr;
    private LocalDateTime dateTime;
    private String description;
    private String status;
    private Integer roomNumber;
    private Integer q_Number;

    private Integer patientId;
    private Integer adminId;
}
