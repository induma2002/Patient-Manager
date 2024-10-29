package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Data
@Table(name = "medical_report")
public class MedicalReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String reportCatogary;
    private String pdfSrc;
    private Integer fkPatientId;
    private Integer adminId;
    private String labNo;
    private LocalDateTime dateAndTime;
}
