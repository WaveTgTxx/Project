package com.example.dto.request.article;


import com.example.entity.Category;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ArticleUpdateRequest {
    @NotNull(message = "Id cannot be Null")
    private Long id;
    private String name;
    private Category category;
}
