package sas.midka.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {
    private Long id;
    private String nameDto;
    private String lastnameDto;
    private String emailDto;
    private String classDto;
}
