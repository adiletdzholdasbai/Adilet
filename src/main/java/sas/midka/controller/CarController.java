package sas.jarys.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import sas.midka.dto.CarDto;
import sas.midka.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public List<CarDto> getAll() {
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public CarDto getByIdCar(@PathVariable Long id) {
        return carService.getById(id);
    }

    @PostMapping
    public CarDto postCar(@RequestBody CarDto carDto) {
        return carService.post(carDto);
    }

    @PutMapping("/{id}")
    public CarDto updateByIdCar(@PathVariable Long id, @RequestBody CarDto carDto) {
        return carService.updateById(id, carDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        carService.deleteById(id);
    }
}






