package com.example.jamespclothinglinerestapi.controller;

import com.example.jamespclothinglinerestapi.models.Post;
import com.example.jamespclothinglinerestapi.serviceImpl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/post") //this is to identify the apiController
public class PostController {

    private PostServiceImpl postService;
     @Autowired
    public PostController (PostServiceImpl postService){
        this.postService = postService; //post service in d field is equal to post servis impl obj in d controla
    }

    @PostMapping("/createPost")
    public ResponseEntity<Post>createPost(@RequestBody Post post){
        Post post1 = postService.savePost.apply(post);

        return new ResponseEntity<>(post, HttpStatus.CREATED);  //response entity
    }
}
