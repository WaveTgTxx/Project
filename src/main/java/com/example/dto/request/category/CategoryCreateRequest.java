package com.example.dto.request.category;

import lombok.Data;

@Data
public class CategoryCreateRequest {
    private String name;
    private Long topicality;
}
