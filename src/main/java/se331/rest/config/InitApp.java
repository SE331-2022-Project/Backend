package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.Patient;
import se331.rest.repository.DoctorCommentRepository;
import se331.rest.repository.PatientRepository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    DoctorCommentRepository doctorCommentRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent){
        Patient tempPatient = null;
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("111")
                        .last_name("111")
                        .age(0)
                        .hometown("111")
                        .vaccine_stat("111")
                        .vaccine_brand("111")
                        .vaccine_date("111")
                .build());
    }
}
