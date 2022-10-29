package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.DoctorCommentDao;
import se331.rest.dao.PatientDao;
import se331.rest.entity.DoctorComment;
import se331.rest.entity.Patient;

import java.util.List;

@Service
public class DoctorCommentServiceImpl implements DoctorCommentService{
    @Autowired
    DoctorCommentDao doctorCommentDao;
    @Autowired
    PatientDao patientDao;
    @Override
    public List<DoctorComment> getAllDoctorComment() {
        return doctorCommentDao.getDoctorcomment(Pageable.unpaged()).getContent();
    }

    @Override
    public DoctorComment save(DoctorComment doctorComment) {
        Patient patient = patientDao.findById(doctorComment.getPatient().getId()).orElse(null);
        doctorComment.setPatient(patient);
        patient.getDoctorComments().add(doctorComment);
        return doctorCommentDao.save(doctorComment);
    }
}
