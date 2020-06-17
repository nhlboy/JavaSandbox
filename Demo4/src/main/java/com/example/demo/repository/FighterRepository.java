package com.example.demo.repository;

import com.example.demo.module.Fighter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FighterRepository extends CrudRepository<Fighter, Integer> {
}
