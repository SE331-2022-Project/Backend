package se331.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.rest.entity.DoctorComment;
import se331.rest.repository.DoctorCommentRepository;

import java.util.Optional;

@Repository
public class DoctorCommentDaoImpl implements DoctorCommentDao{
    @Autowired
    DoctorCommentRepository doctorCommentRepository;

    @Override
    public Page<DoctorComment> getDoctorcomment(Pageable pageRequest) {
        return doctorCommentRepository.findAll(pageRequest);
    }

    @Override
    public Optional<DoctorComment> findById(Long id) {
        return doctorCommentRepository.findById(id);
    }
}
