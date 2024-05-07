    package com.example.hospital_enset;
    import com.example.hospital_enset.Repositories.ConsultationRepository;
    import com.example.hospital_enset.Repositories.MedecinRepository;
    import com.example.hospital_enset.Repositories.PatientRepository;
    import com.example.hospital_enset.Repositories.RendezVousRepository;
    import com.example.hospital_enset.entites.*;
    import com.example.hospital_enset.service.HosipatlService;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.annotation.Bean;

    import java.util.Date;
    import java.util.stream.Stream;

    @SpringBootApplication
    public class HospitalEnsetApplication {
        public static void main(String[] args) {
            SpringApplication.run(HospitalEnsetApplication.class, args);
        }
        @Bean
        CommandLineRunner start(HosipatlService hosipatlService){
            return args -> {
                Stream.of("oussama","yassine","mehdi").forEach(s ->{
                        Patient patient=new Patient();
                        patient.setNom(s);
                        patient.setDate(new Date());
                        patient.setMalade(true);
                        hosipatlService.savePatient(patient);
                });
                Stream.of("abdelkbir","ismail","mustapha").forEach(s -> {
                    Medecin medecin=new Medecin();
                    medecin.setNom(s);
                    medecin.setEmail(s+"@gmail.com");
                    medecin.setSpecialite(Math.random()>0.5?"gastrologie":"dentaire");
                    hosipatlService.saveMedecin(medecin);
                });
                RendezVous rendezVous=new RendezVous();
                rendezVous.setDate(new Date());
                rendezVous.setStatutRdv(StatutRdv.CANCELED);
                rendezVous.setPatient(hosipatlService.findPatientByName("oussama"));
                rendezVous.setMedecin(hosipatlService.findMedecinByName("ismail"));
                hosipatlService.saveRendezVous(rendezVous);
                Consultation consultation=new Consultation();
                consultation.setDateConsultation(new Date());
                consultation.setRapport("rapport des analyses de sang");
                consultation.setRendezVous(rendezVous);
                hosipatlService.saveConsultation(consultation);
                };
        }

    }
