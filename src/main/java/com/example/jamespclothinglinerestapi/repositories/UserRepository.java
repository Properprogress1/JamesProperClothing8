package com.example.jamespclothinglinerestapi.repositories;

import com.example.jamespclothinglinerestapi.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Long> {
    Optional<UserDetails> findByUsername(String username);

    //boolean existByUsername (String username);
    boolean existsByUsername(String username);
}

