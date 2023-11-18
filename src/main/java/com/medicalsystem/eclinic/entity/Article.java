package com.medicalsystem.eclinic.entity;

import javax.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id",length = 45)
    private int articleId;

    @Column(name = "article_topic", length = 200, nullable=false)
    private String articleTopic;

    @Column(name = "image_name", length = 100, nullable=false)
    private String imageName;

    @Column(name = "description",length = 2000,nullable = false)
    private String description;

    public Article() {
    }

    public Article(int articleId, String articleTopic, String imageName, String description) {
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
        return "Article{" +
                "articleId=" + articleId +
                ", articleTopic='" + articleTopic + '\'' +
                ", imageName='" + imageName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
