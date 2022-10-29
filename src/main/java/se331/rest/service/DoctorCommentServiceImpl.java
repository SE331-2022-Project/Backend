package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.DoctorCommentDao;
import se331.rest.entity.DoctorComment;

import java.util.List;

@Service
public class DoctorCommentServiceImpl implements DoctorCommentService{
    @Autowired
    DoctorCommentDao doctorCommentDao;
    @Override
    public List<DoctorComment> getAllDoctorComment() {
        return doctorCommentDao.getDoctorcomment(Pageable.unpaged()).getContent();
    }

    @Override
    public DoctorComment save(DoctorComment doctorComment) {
        return doctorCommentDao.save(doctorComment);
    }
}
