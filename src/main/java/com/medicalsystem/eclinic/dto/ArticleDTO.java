package com.medicalsystem.eclinic.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ArticleDTO {

    private int articleId;

    private String articleTopic;

    private String imageName;

    private String description;

    public ArticleDTO() {
    }

    public ArticleDTO(int articleId, String articleTopic, String imageName, String description) {
        this.articleId = articleId;
        this.articleTopic = articleTopic;
        this.imageName = imageName;
        this.description = description;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleTopic() {
        return articleTopic;
    }

    public void setArticleTopic(String articleTopic) {
        this.articleTopic = articleTopic;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ArticleDTO{" +
                "articleId=" + articleId +
                ", articleTopic='" + articleTopic + '\'' +
                ", imageName='" + imageName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
