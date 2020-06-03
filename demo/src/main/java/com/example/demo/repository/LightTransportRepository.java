package com.example.demo.repository;

import com.example.demo.model.LightTransport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightTransportRepository extends CrudRepository<LightTransport, Integer> {
}
