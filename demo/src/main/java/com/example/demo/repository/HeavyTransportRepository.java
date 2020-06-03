package com.example.demo.repository;

import com.example.demo.model.HeavyTransport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeavyTransportRepository extends CrudRepository<HeavyTransport, Integer> {
}
