package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import se331.rest.service.DoctorCommentService;

@Controller
public class DoctorCommentController {
    @Autowired
    DoctorCommentService doctorCommentService;
    @GetMapping("/organizers")
    ResponseEntity<?> getDoctorComments() {
        return ResponseEntity.ok(doctorCommentService.getAllDoctorComment());
    }
}
