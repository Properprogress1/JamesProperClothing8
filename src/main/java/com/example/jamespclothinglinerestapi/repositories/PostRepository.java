package com.example.jamespclothinglinerestapi.repositories;

import com.example.jamespclothinglinerestapi.models.Post;
import com.example.jamespclothinglinerestapi.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
