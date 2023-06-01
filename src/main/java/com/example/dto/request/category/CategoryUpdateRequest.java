package com.example.dto.request.category;

import lombok.Data;

import javax.validation.constraints.NotNull;
@Data
public class CategoryUpdateRequest {
    private String name;
    private Long topicality;

}
