package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalReport {
    private Integer id;
    private String reportCatogary;
    private String pdfSrc;
    private String labNo;
    private LocalDateTime dateAndTime;

    private Integer patientId;
    private Integer adminId;
}
