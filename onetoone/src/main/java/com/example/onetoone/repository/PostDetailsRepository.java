package com.example.onetoone.repository;

import com.example.onetoone.model.PostDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDetailsRepository extends CrudRepository<PostDetails, Long> {
}
