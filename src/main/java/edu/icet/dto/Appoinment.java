package edu.icet.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Appoinment {
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
