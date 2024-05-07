package com.example.hospital_enset.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

import java.util.Date;
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class RendezVous {
    @Id
    private String  id;
    @Temporal(TemporalType.TIME)
    private Date date;
    @Column(name="Statut")
    @Enumerated(EnumType.STRING)
    private StatutRdv statutRdv;
    @ManyToOne
    private Medecin medecin;
    @ManyToOne
    private Patient patient;
    @OneToOne(mappedBy = "rendezVous")
    @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
    private Consultation consultation;
}
