package com.example.hospital_enset.Repositories;

import com.example.hospital_enset.entites.Consultation;
import com.example.hospital_enset.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
