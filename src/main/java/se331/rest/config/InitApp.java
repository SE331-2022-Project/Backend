package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import se331.rest.entity.Doctor;
import se331.rest.entity.DoctorComment;
import se331.rest.entity.Patient;
import se331.rest.repository.DoctorCommentRepository;
import se331.rest.repository.DoctorRepository;
import se331.rest.repository.PatientRepository;
import se331.rest.security.entity.Authority;
import se331.rest.security.entity.AuthorityName;
import se331.rest.security.entity.User;
import se331.rest.security.repository.AuthorityRepository;
import se331.rest.security.repository.UserRepository;

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
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    AuthorityRepository authorityRepository;
    @Autowired
    UserRepository userRepository;
    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent){
        Doctor d1;
        d1 = doctorRepository.save(Doctor.builder().doctor_name("doctor").build());
        Patient tempPatient = null;
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Anan")
                        .last_name("Kongdecha")
                        .age(22)
                        .hometown("Bangkok")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("Pfizer")
                        .vaccine_date1("02/05/2021")
                        .doctor(d1)
                .build());
        DoctorComment dc = doctorCommentRepository.save(DoctorComment.builder()
                .title("safe")
                .comment("the patient is good")
                .patient(tempPatient)
                .build());
        tempPatient.getDoctorComments().add(dc);
        d1.getPatients().add(tempPatient);
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Kitti")
                        .last_name("Mamaung")
                        .age(24)
                        .hometown("Tak")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("AstraZeneca")
                        .vaccine_date1("11/06/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Patikool")
                        .last_name("Konpetch")
                        .age(35)
                        .hometown("Phetchabun")
                        .vaccine_stat("First Dose")
                        .vaccine_brand1("AstraZeneca")
                        .vaccine_date1("03/03/2022")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Kingkaew")
                        .last_name("Klaewklad")
                        .age(26)
                        .hometown("Nan")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("Sinovac")
                        .vaccine_date1("22/06/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Tongrak")
                        .last_name("Jakkajee")
                        .age(46)
                        .hometown("Prae")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("Sinovac")
                        .vaccine_date1("03/04/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Pimchanok")
                        .last_name("Kongkhakhet")
                        .age(17)
                        .hometown("ChiangMai")
                        .vaccine_stat("First Dose")
                        .vaccine_brand1("Pfizer")
                        .vaccine_date1("12/06/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Jason")
                        .last_name("Brown")
                        .age(30)
                        .hometown("Bangkok")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("Pfizer")
                        .vaccine_date1("30/06/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Mutisorn")
                        .last_name("Kornkamol")
                        .age(30)
                        .hometown("ChaingMai")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("AstraZeneca")
                        .vaccine_date1("05/05/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Joe")
                        .last_name("Mama")
                        .age(60)
                        .hometown("Lumphun")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("Sinovac")
                        .vaccine_date1("11/03/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Adisorn")
                        .last_name("Gonzalez")
                        .age(25)
                        .hometown("SaraBuri")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("Pfizer")
                        .vaccine_date1("02/02/2022")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Burapa")
                        .last_name("AongAad")
                        .age(54)
                        .hometown("Phetchabun")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("Sinovac")
                        .vaccine_date1("16/05/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Dumrong")
                        .last_name("Kongkoi")
                        .age(48)
                        .hometown("Nakhon Ratchasima")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("AstraZeneca")
                        .vaccine_date1("11/01/2022")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Pattinson")
                        .last_name("Roy")
                        .age(26)
                        .hometown("Bangkok")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("Pfizer")
                        .vaccine_date1("11/06/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Lung")
                        .last_name("Dum")
                        .age(64)
                        .hometown("Lumphun")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("Sinovac")
                        .vaccine_date1("26/04/2021")
                .build());
        tempPatient = patientRepository.save(Patient.builder()
                        .first_name("Timothy")
                        .last_name("Lawrence")
                        .age(35)
                        .hometown("Bangkok")
                        .vaccine_stat("Second Dose")
                        .vaccine_brand1("Johnson&Johnson")
                        .vaccine_date1("20/06/2021")
                .build());
        addUser();
        d1.setUser(user1);
        user1.setDoctor(d1);
    }
    User user1,user2,user3;
    private  void addUser(){

        PasswordEncoder encoder = new BCryptPasswordEncoder();
        Authority authUser = Authority.builder().name(AuthorityName.ROLE_USER).build();
        Authority authAdmin = Authority.builder().name(AuthorityName.ROLE_ADMIN).build();
        user1 = User.builder()
                .username("admin")
                .password(encoder.encode("admin"))
                .firstname("admin")
                .lastname("admin")
                .email("admin@admin.com")
                .enabled(true)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021,01,01).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();

        user2 = User.builder()
                .username("user")
                .password(encoder.encode("user"))
                .firstname("user")
                .lastname("user")
                .email("enabled@user.com")
                .enabled(true)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021,01,01)
                        .atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();
        user3 = User.builder()
                .username("disableUser")
                .password(encoder.encode("disableUser"))
                .firstname("disableUser")
                .lastname("disableUser")
                .email("disableUser@user.com")
                .enabled(false)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021,01,01)
                        .atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();
        authorityRepository.save(authUser);
        authorityRepository.save(authAdmin);
        user1.getAuthorities().add(authUser);
        user1.getAuthorities().add(authAdmin);
        user2.getAuthorities().add(authUser);
        user3.getAuthorities().add(authUser);
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

    }
}
