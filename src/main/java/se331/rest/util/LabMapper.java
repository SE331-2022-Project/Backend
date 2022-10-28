package se331.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import se331.rest.dto.DoctorCommentDTO;
import se331.rest.dto.PatientDTO;
import se331.rest.entity.DoctorComment;
import se331.rest.entity.Patient;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(imports = Collectors.class)
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    PatientDTO getPatientDTO(Patient patient);
    List<PatientDTO> getPatientDTO(List<Patient> patients);
    DoctorCommentDTO getDoctorCommentDTO(DoctorComment doctorComment);
    List<DoctorCommentDTO> getDoctorCommentDTO(List<DoctorComment> doctorComments);
}
