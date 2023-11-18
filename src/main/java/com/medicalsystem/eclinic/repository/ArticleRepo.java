package com.medicalsystem.eclinic.repository;

import com.medicalsystem.eclinic.entity.Article;
import com.medicalsystem.eclinic.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ArticleRepo  extends JpaRepository<Article,Integer> {
}
