package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.PatientDao;
import se331.rest.entity.Patient;

import javax.transaction.Transactional;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientDao patientDao;
    @Override
    public Integer getPatientSize() {
        return patientDao.getPatientSize();
    }

    @Override
    public Page<Patient> getPatients(Integer pageSize, Integer page) {
        return patientDao.getPatients(pageSize, page);
    }

    @Override
    public Patient getPatient(Long id) {
        return patientDao.getPatients(id);
    }

    @Override
    @Transactional
    public Patient save(Patient patient) {
        return patientDao.save(patient);
    }

//    @Override
//    public Page<Patient> getPatients(String title, Pageable pageable) {
//        return null;
//    }
}

