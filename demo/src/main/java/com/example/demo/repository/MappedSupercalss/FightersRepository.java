package com.example.demo.repository.MappedSuperclass;

import com.example.demo.model.MappedSuperclass.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FightersRepository extends JpaRepository<Employee, Integer> {
}
