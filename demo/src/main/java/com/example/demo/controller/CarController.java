package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
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
    @GetMapping("/id/{id}")
    public Car getCarById(@PathVariable("id") int id) {
        return carRepository.findById(id).get();
//    return id;
    }

    @GetMapping("/name/{name}/{model}")
    public List<Car> getCarsByName(@PathVariable String name, @PathVariable String model) {
        return carRepository.findAllByNameAndModel(name, model);
    }

    @GetMapping("/name/{name}")
    List<Car> findByName(String name) {
        return carRepository.findByName(name);
    }

    @GetMapping("/age/{age}")
    List<Car>findTop3ByAge() {
        return carRepository.findTop3ByAge();
    }

}
