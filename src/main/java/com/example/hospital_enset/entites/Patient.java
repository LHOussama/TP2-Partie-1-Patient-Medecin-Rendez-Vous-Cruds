package com.example.hospital_enset.entites;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import java.util.Collection;
import java.util.Date;
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date date;
    private boolean malade;
    @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy ="patient",fetch =FetchType.LAZY )
    private Collection <RendezVous>  rendezVous;
}
