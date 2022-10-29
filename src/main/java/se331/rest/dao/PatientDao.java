package se331.rest.dao;

import org.springframework.data.domain.Page;
import se331.rest.entity.Patient;

import java.util.Optional;

public interface PatientDao {
    Integer getPatientSize();
    Page<Patient> getPatients(Integer pageSize, Integer page);
    Patient getPatients(Long id);
    Patient save(Patient patient);
    Optional<Patient> findById(Long id);
}
