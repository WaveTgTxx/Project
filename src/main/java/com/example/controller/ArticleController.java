package com.example.controller;

import com.example.dto.request.article.ArticleUpdateRequest;
import com.example.dto.request.article.ArticleCreateRequest;
import com.example.dto.response.article.ArticleResponse;
import com.example.mapper.ArticleMapperImpl;
import com.example.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/article")
public class ArticleController {
    private ArticleService articleService;
    private ArticleMapperImpl articleMapper;

    @GetMapping
    public List<ArticleResponse> articles(){
        return articleService.article().stream().map(articleMapper::toDto).toList();
    }
    @PostMapping("/add")
    public ResponseEntity<ArticleResponse> addArticle(@Valid @RequestBody ArticleCreateRequest articleDto){
        return new ResponseEntity<>(articleMapper.toDto(articleService.add(articleMapper.fromDto(articleDto))), HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ArticleResponse> update(@Valid @RequestBody ArticleUpdateRequest articleUpdateDto){
        return new ResponseEntity<>(articleMapper.toDto(articleService.update(articleMapper.fromDto(articleUpdateDto))), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ArticleResponse findByID(@Valid @PathVariable Long id){
        return articleMapper.toDto(articleService.findById(id));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        articleService.deleteById(id);
    }
}
