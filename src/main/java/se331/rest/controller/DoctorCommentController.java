package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se331.rest.entity.DoctorComment;
import se331.rest.entity.Patient;
import se331.rest.service.DoctorCommentService;
import se331.rest.util.LabMapper;

@RestController
public class DoctorCommentController {
    @Autowired
    DoctorCommentService doctorCommentService;
    @GetMapping("/doctorcomments")
    ResponseEntity<?> getDoctorComments() {
        return ResponseEntity.ok(LabMapper.INSTANCE.getDoctorCommentDTO(doctorCommentService.getAllDoctorComment()));
    }
    @PostMapping("/doctorcomments")
    public ResponseEntity<?> addPatient(@RequestBody DoctorComment doctorComment) {
        DoctorComment output = doctorCommentService.save(doctorComment);
        return ResponseEntity.ok(LabMapper.INSTANCE.getDoctorCommentDTO(output));
    }
}
