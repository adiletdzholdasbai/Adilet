package sas.midka.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sas.midka.dto.DriverDto;
import sas.midka.entity.DriverEntity;
import sas.midka.mapper.DriverMapper;
import sas.midka.repository.DriverRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DriverService {
    private final DriverRepository driverRepository;
    private final DriverMapper driverMapper;
    public List<DriverDto> getAll(){
        return driverMapper.toDtoList(driverRepository.findAll());
    }
    public DriverDto getById(Long id){
        DriverEntity driverEntity = driverRepository.findById(id).orElseThrow();
        DriverDto driverDto = driverMapper.toDto(driverEntity);
        return driverDto;
    }
    public boolean deleteById(Long id){
        if (driverRepository.existsById(id)){
            driverRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

}
