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
    String vaccine_brand1;
    String vaccine_date1;
    String vaccine_brand2;
    String vaccine_date2;
    List<PatientDcDTO> doctorComments;
    List<String> imageUrls;
}
