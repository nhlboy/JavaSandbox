package com.example.demo.controller;

import com.example.demo.module.Truck;
import com.example.demo.repository.TruckRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/truck")

public class TruckController {
    private TruckRepository truckRepository;

    public TruckController(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    @GetMapping
    public Iterable<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    @PostMapping
    public Truck createTruck(@RequestBody Truck truck) {
        return truckRepository.save(truck);
    }
}
