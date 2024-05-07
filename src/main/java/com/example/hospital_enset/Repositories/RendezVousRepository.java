package com.example.hospital_enset.Repositories;

import com.example.hospital_enset.entites.Patient;
import com.example.hospital_enset.entites.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}
