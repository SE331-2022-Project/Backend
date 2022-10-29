package se331.rest.service;

import org.springframework.data.domain.Page;
import se331.rest.entity.DoctorComment;
import se331.rest.entity.Patient;

import java.util.List;

public interface DoctorCommentService {
    List<DoctorComment> getAllDoctorComment();
    DoctorComment save(DoctorComment doctorComment);
}
