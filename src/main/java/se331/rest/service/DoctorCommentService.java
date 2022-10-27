package se331.rest.service;

import org.springframework.data.domain.Page;
import se331.rest.entity.DoctorComment;

import java.util.List;

public interface DoctorCommentService {
    List<DoctorComment> getAllDoctorComment();
    Page<DoctorComment> getDoctorComment(Integer page, Integer pageSize);
}
