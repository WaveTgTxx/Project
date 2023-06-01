package com.example.dto.response.user;

import com.example.entity.Article;
import lombok.Data;

import java.util.Set;

@Data
public class UserResponse {
    private String Name;
    private String email;
    private Set<Article> articles;
}
