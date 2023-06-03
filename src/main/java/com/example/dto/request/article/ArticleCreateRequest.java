package com.example.dto.request.article;

import com.example.entity.Category;
import lombok.Data;


import javax.validation.constraints.NotNull;

@Data
public class ArticleCreateRequest {
    @NotNull(message = "Name cannot be null")
    private String name;
    private Category category;

}
