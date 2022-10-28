package se331.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import se331.rest.entity.DoctorComment;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
    Long id;
    String first_name;
    String last_name;
    int age;
    String hometown;
    String vaccine_stat;
    String vaccine_brand;
    String vaccine_date;
    List<PatientDcDTO> doctorComments;
}
