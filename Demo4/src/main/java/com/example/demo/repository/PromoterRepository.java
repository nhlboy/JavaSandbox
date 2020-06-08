package com.example.demo.repository;

import com.example.demo.module.Promoter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PromoterRepository extends CrudRepository<Promoter, Integer> {
}
