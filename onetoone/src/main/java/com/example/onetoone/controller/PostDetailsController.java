package com.example.onetoone.controller;

import com.example.onetoone.model.PostDetails;
import com.example.onetoone.repository.PostDetailsRepository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/postdetails")
public class PostDetailsController {
    PostDetailsRepository postDetailsRepository;

    public PostDetailsController(PostDetailsRepository postDetailsRepository) {
        this.postDetailsRepository = postDetailsRepository;
    }

    @GetMapping
    public Iterable<PostDetails> getPostDetails() {
        return postDetailsRepository.findAll();
    }

    @PostMapping
    public PostDetails savePostDetails(@RequestBody PostDetails postDetails) {
        return postDetailsRepository.save(postDetails);
    }

}
