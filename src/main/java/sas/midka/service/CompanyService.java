package sas.midka.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sas.midka.dto.CarDto;
import sas.midka.dto.CompanyDto;
import sas.midka.entity.CompanyEntity;
import sas.midka.mapper.CompanyMapper;
import sas.midka.repository.CompanyRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;
    public List<CompanyDto> getAll(){
        return companyMapper.toDtoList(companyRepository.findAll());
    }
    public CompanyDto getById(Long id){
        CompanyEntity companyEntity =companyRepository.findById(id).orElseThrow();
        CompanyDto companyDto = companyMapper.toDto(companyEntity);
        return companyDto;
    }
    public boolean deleteById(Long id){
        if (companyRepository.existsById(id)){
            companyRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
    public CompanyDto post(CompanyDto companyDto){
        CompanyEntity companyEntity = companyMapper.toEntity(companyDto);
        companyRepository.save(companyEntity);
        return companyMapper.toDto(companyEntity);

    }
    public CompanyDto updateById(Long id,CompanyDto companyDto){
        CompanyEntity companyEntity1 = companyRepository.findById(id).orElseThrow();
        companyEntity1.setNameEntity(companyDto.getNameDto());
        companyEntity1.setAddressEntity(companyDto.getAddressDto());
        companyEntity1.setEmailEntity(companyDto.getEmailDto());
        companyEntity1.setCountryEntity(companyDto.getCountryDto());
        companyRepository.save(companyEntity1);
        return companyDto;
    }
}




