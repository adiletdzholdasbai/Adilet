package sas.midka.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sas.midka.dto.CarDto;
import sas.midka.entity.CarEntity;
import sas.midka.mapper.CarMapper;
import sas.midka.repository.CarRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {
    private final CarRepository carRepository;
    private final CarMapper carMapper;
    public List<CarDto> getAll(){
        return carMapper.toDtoList(carRepository.findAll());
    }
    public CarDto getById(Long id){
        CarEntity carEntity = carRepository.findById(id).orElseThrow();
        CarDto carDto = carMapper.toDto(carEntity);
        return carDto;
    }
    public CarDto postCar(CarDto carDto){
        CarEntity carEntity = carMapper.toEntity(carDto);
        carRepository.save(carEntity);
        return carMapper.toDto(carEntity);
    }
    public void deleteByIdCar(Long id){
        carRepository.deleteById(id);
    }
    public CarDto updateByIdCar(Long id,CarDto carDto){
        CarEntity carEntity1 = carRepository.findById(id).orElseThrow();
        carEntity1.setNameEntity(carDto.getNameDto());
        carEntity1.setColorEntity(carDto.getColorDto());
        carEntity1.setSizeEntity(carDto.getSizeDto());
        carEntity1.setCountryEntity(carDto.getCountryDto());
        carRepository.save(carEntity1);
        return carMapper.toDto(carEntity1);
    }




}


