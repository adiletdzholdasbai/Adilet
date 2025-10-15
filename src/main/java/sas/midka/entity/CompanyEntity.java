package sas.midka.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "companyEntities")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameEntity;
    private String countryEntity;
    private String addressEntity;
    private String emailEntity;
}
