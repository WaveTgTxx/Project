package com.example.dto.request.category;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CategoryCreateRequest {
    @NotNull(message = "Name cannot be null")
    private String name;
    @NotNull(message = "Topicality cannot be null")
    @Range(min=1, max=3)
    private Long topicality;

}
