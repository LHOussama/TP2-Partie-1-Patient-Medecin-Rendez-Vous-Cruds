package com.example.hospital_enset.service;

import com.example.hospital_enset.entites.Consultation;
import com.example.hospital_enset.entites.Medecin;
import com.example.hospital_enset.entites.Patient;
import com.example.hospital_enset.entites.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HosipatlService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    Consultation saveConsultation(Consultation consultation);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Patient findPatientByName(String nom);
    Medecin findMedecinByName(String nom);


}
