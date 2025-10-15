package sas.midka.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sas.midka.dto.CarDto;
import sas.midka.entity.CarEntity;

import java.util.List;

@Mapper(componentModel = "spring")

public interface CarMapper {
    @Mapping(target = "nameDto",source = "nameEntity")
    @Mapping(target = "colorDto",source = "colorEntity")
    @Mapping(target = "countryDto",source = "countryEntity")
    @Mapping(target = "sizeDto",source = "sizeEntity")
    CarDto toDto(CarEntity carEntity);
    @Mapping(target = "nameEntity",source = "nameDto")
    @Mapping(target = "colorEntity",source = "colorDto")
    @Mapping(target = "countryEntity",source = "countryDto")
    @Mapping(target = "sizeEntity",source = "sizeDto")
    CarEntity toEntity(CarDto carDto);
    List<CarDto> toDtoList(List<CarEntity> carEntities);



}
