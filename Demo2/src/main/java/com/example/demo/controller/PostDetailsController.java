package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.model.PostDetails;
import com.example.demo.repository.PostDetailesRepository;
import com.example.demo.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/postdetailes")


public class PostDetailsController {

    private PostDetailesRepository postDetailesRepository;

    public PostDetailsController(PostDetailesRepository postDetailesRepository) {
        this.postDetailesRepository = postDetailesRepository;
    }

    @GetMapping
    public Iterable<PostDetails> getPostDetailes() {
        return postDetailesRepository.findAll();
    }

    @PostMapping
    public PostDetails createPost(@RequestBody PostDetails postDetails) {
        return postDetailesRepository.save(postDetails);
    }
}
