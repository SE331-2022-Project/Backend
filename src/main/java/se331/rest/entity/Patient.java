package se331.rest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String first_name;
    String last_name;
    int age;
    String hometown;
    String vaccine_stat;
    String vaccine_brand;
    String vaccine_date;
    @OneToMany(mappedBy = "patient")
    @Builder.Default
    List<DoctorComment> doctorComments = new ArrayList<>();
//    @ElementCollection
//    List<String> imageUrls;
}
