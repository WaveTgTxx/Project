package com.example.mapper;

import com.example.dto.request.article.ArticleCreateRequest;
import com.example.dto.request.article.ArticleUpdateRequest;
import com.example.dto.response.article.ArticleResponse;
import com.example.entity.Article;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    ArticleResponse toDto(Article entity);

    Article fromDto(ArticleCreateRequest dto);
    Article fromDto (ArticleUpdateRequest dto);
}
