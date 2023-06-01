package com.example.dto.request.article;


import com.example.entity.Category;
import lombok.Data;

@Data
public class ArticleUpdateRequest {
    private Long id;
    private String name;
    private Category category;
}
