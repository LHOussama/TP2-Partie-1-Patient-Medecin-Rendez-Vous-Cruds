package com.example.hospital_enset.Repositories;

import com.example.hospital_enset.entites.Medecin;
import com.example.hospital_enset.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom);
}
