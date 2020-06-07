package com.example.demo.repository;


import com.example.demo.model.PostDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDetailesRepository extends CrudRepository<PostDetails, Integer> {
}
