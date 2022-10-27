package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.DoctorComment;

import java.util.Optional;

public interface DoctorCommentDao {
    Page<DoctorComment> getDoctorcomment(Pageable pageRequest);
    Optional<DoctorComment> findById(Long id);
}
