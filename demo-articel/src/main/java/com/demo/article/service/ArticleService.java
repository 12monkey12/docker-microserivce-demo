package com.demo.article.service;

import com.demo.article.pojo.Article;

import java.util.List;

public interface ArticleService {

    List<Article> findAll();

    Article findById(Integer id);

    void add(Article article);

    void updae(Article article);

    void deleteById(Integer id);
}
