package se331.rest.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DoctorComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String doctor_name;
    String title;
    String comment;
@ManyToOne
    Patient patient;
}
