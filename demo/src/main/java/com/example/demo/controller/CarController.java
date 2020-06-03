package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.model.HeavyTransport;
import com.example.demo.repository.HeavyTransportRepository;
import com.example.demo.repository.LightTransportRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    private HeavyTransportRepository heavyTransportRepository;
    private LightTransportRepository lightTransportRepository;

    public CarController(HeavyTransportRepository heavyTransportRepository, LightTransportRepository lightTransportRepository) {
        this.heavyTransportRepository = heavyTransportRepository;
        this.lightTransportRepository = lightTransportRepository;
    }

    @GetMapping("/heavytransport")
    public Iterable<HeavyTransport> getHeavyTransport() {
        return heavyTransportRepository.findAll();
    }

//    {
//        "model":"T660",
//            "name":"Kenworth",
//            "carryingCapacity":80000
//    }

    @PostMapping("/heavytransport")
    public HeavyTransport post(@RequestBody HeavyTransport heavyTransport) {
        return heavyTransportRepository.save(heavyTransport);
    }

}
