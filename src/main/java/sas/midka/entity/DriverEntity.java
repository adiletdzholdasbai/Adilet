package sas.midka.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "driverEntities")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameEntity;
    private String lastnameEntity;
    private String emailEntity;
    private String classEntity;
}
