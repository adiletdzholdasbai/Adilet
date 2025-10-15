package sas.midka.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDto {
    private Long id;
    private String nameDto;
    private String colorDto;
    private String countryDto;
    private String sizeDto;
}
