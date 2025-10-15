package sas.midka.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sas.midka.dto.DriverDto;
import sas.midka.entity.DriverEntity;


import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    @Mapping(target = "nameDto",source = "nameEntity")
    @Mapping(target = "lastnameDto",source = "lastnameEntity")
    @Mapping(target = "emailDto",source = "emailEntity")
    @Mapping(target = "classDto",source = "classEntity")
    DriverDto toDto(DriverEntity driverEntity);
    @Mapping(target = "nameEntity",source = "nameDto")
    @Mapping(target = "lastnameEntity",source = "lastnameDto")
    @Mapping(target = "emailEntity",source = "emailDto")
    @Mapping(target = "classEntity",source = "classDto")
    DriverEntity toEntity(DriverDto driverDto);
    List<DriverDto> toDtoList(List<DriverEntity> driverEntities);
}
