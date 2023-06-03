package com.example.service;

import com.example.entity.Article;
import com.example.exception.ArticleNotFoundException;
import com.example.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleService {
    private ArticleRepository articleRepository;

    public List<Article> article(){
        return articleRepository.findAll();
    }
    public Article add(Article article){
        return articleRepository.save(article);
    }
    public Article update (Article article){return articleRepository.save(article);}
    public Article findById (Long id){
        return articleRepository.findById(id).orElseThrow(()->new ArticleNotFoundException("Article with id "+id + " not found"));
    }
    public void deleteById (Long id){articleRepository.deleteById(id);}
}
