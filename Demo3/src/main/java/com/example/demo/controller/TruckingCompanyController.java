package com.example.demo.controller;

import com.example.demo.module.TruckingCompany;
import com.example.demo.repository.TruckingCompanyRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/truckingcompany")

public class TruckingCompanyController {
    private TruckingCompanyRepository truckingCompanyRepository;

    public TruckingCompanyController(TruckingCompanyRepository truckingCompanyRepository) {
        this.truckingCompanyRepository = truckingCompanyRepository;
    }

    @GetMapping
    public Iterable<TruckingCompany> getAllTruckingCompanies() {
        return truckingCompanyRepository.findAll();
    }

    @PostMapping
    public TruckingCompany createTruckingCompany(@RequestBody TruckingCompany truckingCompany) {
        return truckingCompanyRepository.save(truckingCompany);
    }
}
