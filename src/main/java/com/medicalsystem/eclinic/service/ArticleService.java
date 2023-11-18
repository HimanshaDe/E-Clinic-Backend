package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.ArticleDTO;

import java.util.List;

public interface ArticleService {
    String saveArticle(ArticleDTO articleDTO);

    List<ArticleDTO> getAllArticles();

    String updateArticle(ArticleDTO articleDTO);

    ArticleDTO getArticleById(int articleId);
}
