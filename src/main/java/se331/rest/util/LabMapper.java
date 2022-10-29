package se331.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se331.rest.dto.DoctorAuthDTO;
import se331.rest.dto.DoctorCommentDTO;
import se331.rest.dto.DoctorDTO;
import se331.rest.dto.PatientDTO;
import se331.rest.entity.Doctor;
import se331.rest.entity.DoctorComment;
import se331.rest.entity.Patient;
import se331.rest.security.entity.User;
import se331.rest.security.entity.UserDTO;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(imports = Collectors.class)
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    PatientDTO getPatientDTO(Patient patient);
    List<PatientDTO> getPatientDTO(List<Patient> patients);
    DoctorCommentDTO getDoctorCommentDTO(DoctorComment doctorComment);
    List<DoctorCommentDTO> getDoctorCommentDTO(List<DoctorComment> doctorComments);
    DoctorDTO getDoctorDTO(Doctor doctor);
    List<DoctorDTO> getDoctorDTO(List<Doctor> doctors);
    UserDTO getUserDTO(User user);
    @Mapping(target = "authorities", expression = "java(doctor.getUser().getAuthorities().stream().map(auth -> auth.getName().name()).collect(Collectors.toList()))")
    DoctorAuthDTO getDoctorAuthDTO(Doctor doctor);
}
