package com.example.demo.repository;

import com.example.demo.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CarRepository extends CrudRepository<Car, Integer> {
public List<Car> findAllByName(String name);


}
