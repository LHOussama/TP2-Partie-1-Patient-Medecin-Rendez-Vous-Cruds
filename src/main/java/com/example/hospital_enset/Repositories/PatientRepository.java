package com.example.hospital_enset.Repositories;

import com.example.hospital_enset.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String nom);
}
