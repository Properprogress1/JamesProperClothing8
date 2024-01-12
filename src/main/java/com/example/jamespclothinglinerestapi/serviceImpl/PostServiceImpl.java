package com.example.jamespclothinglinerestapi.serviceImpl;

import com.example.jamespclothinglinerestapi.models.Post;
import com.example.jamespclothinglinerestapi.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service

public class PostServiceImpl {
    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl (PostRepository postRepository){
        this.postRepository = postRepository; //(created a constructor here, to inject postrepository bean)
    }
public Function <Post,Post>savePost = post -> postRepository.save(post);
}
