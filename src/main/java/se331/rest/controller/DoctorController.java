package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import se331.rest.entity.Doctor;
import se331.rest.entity.Patient;
import se331.rest.service.DoctorService;
import se331.rest.util.LabMapper;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @GetMapping("/doctors")
    ResponseEntity<?> getDoctors() {
        return ResponseEntity.ok(LabMapper.INSTANCE.getDoctorDTO(doctorService.getAllDoctor()));
    }
    @GetMapping("/doctors/{id}")
    ResponseEntity<?> getDoctor(@PathVariable("id") Long id) {
        Doctor output = doctorService.getDoctor(id);
        if (output != null ) {
            return ResponseEntity.ok(LabMapper.INSTANCE.getDoctorDTO(output));
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The given id is not found");
        }
    }
    @GetMapping("/doctors/{id}/patients")
    ResponseEntity getDoctorPatient(@PathVariable("id") Long id) {
        Doctor doctor = doctorService.getDoctor(id);
        List<Patient> patientList = doctor.getPatients();
        return ResponseEntity.ok(LabMapper.INSTANCE.getPatientDTO(patientList));
    }
}
