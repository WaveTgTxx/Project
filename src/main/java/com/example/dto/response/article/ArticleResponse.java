package com.example.dto.response.article;

import com.example.entity.Category;
import com.example.entity.User;
import lombok.Data;

@Data
public class ArticleResponse {
    private String name;
    private Category category;
    private User user;
}