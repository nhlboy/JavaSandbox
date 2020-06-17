package com.example.demo.controller;

import com.example.demo.module.Fighter;
import com.example.demo.repository.FighterRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fighter")

public class FighterController {
    private FighterRepository fighterRepository;

    public FighterController(FighterRepository fighterRepository) {
        this.fighterRepository = fighterRepository;
    }

    @GetMapping
    public Iterable<Fighter> getAllFighters() {
        return fighterRepository.findAll();
    }

    //    {
//        "name": "Chuck Liddel"
//    }
    @PostMapping
    public Fighter createFighter(@RequestBody Fighter fighter) {
        return fighterRepository.save(fighter);
    }
}
