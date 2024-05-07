package com.example.hospital_enset.Web;
import com.example.hospital_enset.Repositories.PatientRepository;
import com.example.hospital_enset.entites.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class rendezVousRestController {
    @Autowired
    PatientRepository patientRepository;
    @GetMapping("/patients")
    public List<Patient> Patientlist(){
        return patientRepository.findAll();
    }
}
