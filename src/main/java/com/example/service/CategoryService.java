package com.example.service;

import com.example.entity.Category;
import com.example.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private CategoryRepository categoryRepository;

    public List<Category> categories(){
        return categoryRepository.findAll();
    }
    public Category add(Category category){
        return categoryRepository.save(category);
    }
    public Category update(Category category){
        return categoryRepository.save(category);
    }
    public Category findById(Long id){
        return categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category with id "+ id + " not found"));
    }
    public void delete(Long id){
        categoryRepository.deleteById(id);
    }
}
