package com.example.dto.response.article;

import com.example.entity.Category;
import com.example.entity.User;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ArticleResponse {
    private Long id;
    private String name;
    private Category category;

}