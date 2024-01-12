package com.example.jamespclothinglinerestapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class Comment {
    @Id
    private Long id;
    private String Users_comment;
    private Users commenter;
}
