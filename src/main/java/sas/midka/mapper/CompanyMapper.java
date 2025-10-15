package sas.midka.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sas.midka.dto.CarDto;
import sas.midka.dto.CompanyDto;
import sas.midka.entity.CarEntity;
import sas.midka.entity.CompanyEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    @Mapping(target = "nameDto",source = "nameEntity")
    @Mapping(target = "addressDto",source = "addressEntity")
    @Mapping(target = "countryDto",source = "countryEntity")
    @Mapping(target = "emailDto",source = "emailEntity")
    CompanyDto toDto(CompanyEntity companyEntity);
    @Mapping(target = "nameEntity",source = "nameDto")
    @Mapping(target = "addressEntity",source = "addressDto")
    @Mapping(target = "countryEntity",source = "countryDto")
    @Mapping(target = "emailEntity",source = "emailDto")
    CompanyEntity toEntity(CompanyDto companyDto);
    List<CompanyDto> toDtoList(List<CompanyEntity> companyEntities);
}
