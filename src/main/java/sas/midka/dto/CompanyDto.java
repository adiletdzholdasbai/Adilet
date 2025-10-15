package sas.midka.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CompanyDto {
    private Long id;
    private String nameDto;
    private String countryDto;
    private String addressDto;
    private String emailDto;

}
