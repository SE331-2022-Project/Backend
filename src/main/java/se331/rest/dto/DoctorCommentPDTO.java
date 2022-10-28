package se331.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorCommentPDTO {
    Long id;
    String first_name;
    String last_name;
    int age;
    String hometown;
    String vaccine_stat;
    String vaccine_brand;
    String vaccine_date;
}
