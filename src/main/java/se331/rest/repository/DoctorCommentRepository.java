package se331.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.DoctorComment;

import java.util.List;

public interface DoctorCommentRepository extends JpaRepository<DoctorComment,Long> {
}
