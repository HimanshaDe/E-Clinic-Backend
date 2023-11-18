package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.ArticleDTO;
import com.medicalsystem.eclinic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/article")
@CrossOrigin
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public String saveArticle(@RequestBody ArticleDTO articleDTO){

        String message = articleService.saveArticle(articleDTO);
        return message;
    }

    @GetMapping()
    public List<ArticleDTO> getAllArticles(){
        List<ArticleDTO> allArticles = articleService.getAllArticles();
        return allArticles;
    }
    @PutMapping
    private String updateArticle(@RequestBody ArticleDTO articleDTO){
       String message = articleService.updateArticle(articleDTO);
       return message;
    }
    @GetMapping(
            path = "/get-by-id/{id}"
    )
    public ArticleDTO getArticleById(@PathVariable(value = "id") int article_id){
        ArticleDTO articleDTO = articleService.getArticleById(article_id);
        return articleDTO;
    }

}
