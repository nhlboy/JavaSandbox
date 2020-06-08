package com.example.demo.controller;

import com.example.demo.module.Promoter;
import com.example.demo.repository.PromoterRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/promoter")
public class PromoterController {
    private PromoterRepository promoterRepository;

    public PromoterController(PromoterRepository promoterRepository) {
        this.promoterRepository = promoterRepository;
    }

    @GetMapping
    public Iterable<Promoter> getAllPromoters() {
        return promoterRepository.findAll();
    }

    @PostMapping
    public Promoter createPromoter(@RequestBody Promoter promoter) {
        return promoterRepository.save(promoter);
    }
}
