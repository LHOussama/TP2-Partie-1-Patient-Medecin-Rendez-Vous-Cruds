package com.example.hospital_enset.service;

import com.example.hospital_enset.Repositories.ConsultationRepository;
import com.example.hospital_enset.Repositories.MedecinRepository;
import com.example.hospital_enset.Repositories.PatientRepository;
import com.example.hospital_enset.Repositories.RendezVousRepository;
import com.example.hospital_enset.entites.Consultation;
import com.example.hospital_enset.entites.Medecin;
import com.example.hospital_enset.entites.Patient;
import com.example.hospital_enset.entites.RendezVous;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class HosipatlServiceImpl implements HosipatlService {
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;
    private MedecinRepository medecinRepository;
    private PatientRepository patientRepository;
    public HosipatlServiceImpl(RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository, MedecinRepository medecinRepository, PatientRepository patientRepository) {
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
        this.medecinRepository = medecinRepository;
        this.patientRepository = patientRepository;
    }
    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }
    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Patient findPatientByName(String name) {
        return patientRepository.findByNom(name);
    }

    @Override
    public Medecin findMedecinByName(String nom) {
        return medecinRepository.findByNom(nom);
    }
}
