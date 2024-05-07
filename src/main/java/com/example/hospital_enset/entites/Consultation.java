package com.example.hospital_enset.entites;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIME)
    private Date dateConsultation;
    private String rapport;
    @OneToOne
    private RendezVous rendezVous;
}
