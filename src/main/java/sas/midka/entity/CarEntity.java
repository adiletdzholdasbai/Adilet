package sas.midka.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "carEntities")
@NoArgsConstructor
@Builder
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameEntity;
    private String colorEntity;
    private String countryEntity;
    private String sizeEntity;
}
