package com.example.dto.request.article;

import com.example.entity.Category;
import com.example.entity.User;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ArticleCreateRequest {
    private String name;
    private Category category;
    private User user;
}
