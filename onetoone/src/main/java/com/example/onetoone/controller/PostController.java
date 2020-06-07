package com.example.onetoone.controller;

import com.example.onetoone.model.Post;
import com.example.onetoone.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/post")

public class PostController {
    PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    public Iterable<Post> getPost() {
        return postRepository.findAll();
    }
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

}
