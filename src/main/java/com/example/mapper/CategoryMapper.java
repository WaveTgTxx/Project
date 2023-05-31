package com.example.mapper;

import com.example.dto.request.category.CategoryCreateRequest;
import com.example.dto.response.category.CategoryResponse;
import com.example.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryResponse toDto(Category entity);
    Category fromDto(CategoryCreateRequest dto);
}
