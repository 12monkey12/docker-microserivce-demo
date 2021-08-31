package com.demo.article.dao;

import com.demo.article.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDao extends JpaRepository<Article, Integer> {

}
