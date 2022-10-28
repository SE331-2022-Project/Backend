package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.DoctorComment;
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
                        .first_name("Anan")
                        .last_name("Kongdecha")
                        .age(22)
                        .hometown("Bangkok")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("Pfizer")
                        .vaccine_date("02/05/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Kitti")
                        .last_name("Mamaung")
                        .age(24)
                        .hometown("Tak")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("AstraZeneca")
                        .vaccine_date("11/06/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Patikool")
                        .last_name("Konpetch")
                        .age(35)
                        .hometown("Phetchabun")
                        .vaccine_stat("First Dose")
                        .vaccine_brand("AstraZeneca")
                        .vaccine_date("03/03/2022")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Kingkaew")
                        .last_name("Klaewklad")
                        .age(26)
                        .hometown("Nan")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("Sinovac")
                        .vaccine_date("22/06/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Tongrak")
                        .last_name("Jakkajee")
                        .age(46)
                        .hometown("Prae")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("Sinovac")
                        .vaccine_date("03/04/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Pimchanok")
                        .last_name("Kongkhakhet")
                        .age(17)
                        .hometown("ChiangMai")
                        .vaccine_stat("First Dose")
                        .vaccine_brand("Pfizer")
                        .vaccine_date("12/06/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Jason")
                        .last_name("Brown")
                        .age(30)
                        .hometown("Bangkok")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("Pfizer")
                        .vaccine_date("30/06/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Mutisorn")
                        .last_name("Kornkamol")
                        .age(30)
                        .hometown("ChaingMai")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("AstraZeneca")
                        .vaccine_date("05/05/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Joe")
                        .last_name("Mama")
                        .age(60)
                        .hometown("Lumphun")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("Sinovac")
                        .vaccine_date("11/03/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Adisorn")
                        .last_name("Gonzalez")
                        .age(25)
                        .hometown("SaraBuri")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("Pfizer")
                        .vaccine_date("02/02/2022")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Burapa")
                        .last_name("AongAad")
                        .age(54)
                        .hometown("Phetchabun")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("Sinovac")
                        .vaccine_date("16/05/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Dumrong")
                        .last_name("Kongkoi")
                        .age(48)
                        .hometown("Nakhon Ratchasima")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("AstraZeneca")
                        .vaccine_date("11/01/2022")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Pattinson")
                        .last_name("Roy")
                        .age(26)
                        .hometown("Bangkok")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("Pfizer")
                        .vaccine_date("11/06/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Lung")
                        .last_name("Dum")
                        .age(64)
                        .hometown("Lumphun")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("Sinovac")
                        .vaccine_date("26/04/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Timothy")
                        .last_name("Lawrence")
                        .age(35)
                        .hometown("Bangkok")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand("Johnson&Johnson")
                        .vaccine_date("20/06/2021")
                .build());
        DoctorComment dc = doctorCommentRepository.save(DoctorComment.builder()
                .doctor_name("doctor")
                .title("safe")
                .comment("the patient is good")
                .patient(tempPatient)
                .build());
        tempPatient.getDoctorComments().add(dc);

    }
}
