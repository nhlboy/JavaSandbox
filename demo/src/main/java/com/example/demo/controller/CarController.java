package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
//    http://localhost:8080/
    @GetMapping
    public Iterable<Car> getAllCar() {
        return carRepository.findAll();
    }
//    http://localhost:8080/1
    @GetMapping("/{id}")
    public Car getCarById(@PathVariable int id) {
        return carRepository.findById(id).get();
    }

    @GetMapping("/{name}")
    public List<Car> getCarsByName(@PathVariable String name) {
        return carRepository.findAllByName(name);
    }

}
