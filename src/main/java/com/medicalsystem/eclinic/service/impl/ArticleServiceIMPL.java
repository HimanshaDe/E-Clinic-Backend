package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.ArticleDTO;
import com.medicalsystem.eclinic.entity.Article;
import com.medicalsystem.eclinic.repository.ArticleRepo;
import com.medicalsystem.eclinic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceIMPL implements ArticleService {

    @Autowired
    ArticleRepo articleRepo;
    @Override
    public String saveArticle(ArticleDTO articleDTO) {
        Article article = new Article(
             articleDTO.getArticleId(),articleDTO.getArticleTopic(),articleDTO.getImageName(),articleDTO.getDescription()
        );

        System.out.println(article);
        articleRepo.save(article);
        return null;
    }

    @Override
    public List<ArticleDTO> getAllArticles() {
        List<Article> getAllArticles = articleRepo.findAll();
        List <ArticleDTO> articleDTOList = new ArrayList<>();

        for (Article article : getAllArticles){
            ArticleDTO articleDTO = new ArticleDTO(
                    article.getArticleId(),article.getArticleTopic(),article.getImageName(),article.getDescription()
            );
            articleDTOList.add(articleDTO);
        }

        return articleDTOList;
    }

    @Override
    public String updateArticle(ArticleDTO articleDTO) {
        if (articleRepo.existsById((articleDTO.getArticleId()))) {
            Article article = articleRepo.getReferenceById(articleDTO.getArticleId());
            article.setArticleTopic(articleDTO.getArticleTopic());
            article.setDescription(articleDTO.getDescription());
            article.setImageName(articleDTO.getImageName());
            System.out.println(article);
            articleRepo.save(article);
            return articleDTO.getArticleTopic()+ "updated";
        }else{
            throw new RuntimeException("No data found!");
        }

    }

    @Override
    public ArticleDTO getArticleById(int articleId) {
        if(articleRepo.existsById(articleId)){
            Article article =articleRepo.getReferenceById((articleId));
            ArticleDTO articleDTO = new ArticleDTO(
                    article.getArticleId(),article.getArticleTopic(),article.getImageName(),article.getDescription()
            );
            return articleDTO;
        }else{
            throw new RuntimeException("Not found");
        }

    }

}
