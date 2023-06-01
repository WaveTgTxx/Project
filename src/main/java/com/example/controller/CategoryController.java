package com.example.controller;

import com.example.dto.request.category.CategoryCreateRequest;
import com.example.dto.request.category.CategoryUpdateRequest;
import com.example.dto.response.category.CategoryResponse;
import com.example.entity.Category;
import com.example.mapper.CategoryMapperImpl;
import com.example.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {
    private CategoryService categoryService;
    private CategoryMapperImpl categoryMapper;

    @GetMapping
    public List<CategoryResponse> categories(){
        return categoryService.categories().stream().map(categoryMapper::toDto).toList();
    }
    @PostMapping("/add")
    public ResponseEntity<CategoryResponse> add(@Valid @RequestBody CategoryCreateRequest categoryDto) {
        return new ResponseEntity<>(categoryMapper.toDto(categoryService.add(categoryMapper.fromDto(categoryDto))), HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<CategoryResponse> update(@Valid @RequestBody CategoryUpdateRequest categoryUpdateDto) {
        return new ResponseEntity<>(categoryMapper.toDto(categoryService.update(categoryMapper.fromDto(categoryUpdateDto))), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public CategoryResponse findById(@PathVariable Long id){
        return categoryMapper.toDto(categoryService.findById(id));
    }
    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable Long id){
        categoryService.delete(id);
    }
}
