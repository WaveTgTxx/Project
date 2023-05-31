package com.example.controller;

import com.example.ArticleService;
import com.example.dto.response.article.ArticleResponse;

import com.example.mapper.ArticleMapper;
import com.example.mapper.ArticleMapperImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
