package com.demo.article.service.impl;

import com.demo.article.dao.ArticleDao;
import com.demo.article.pojo.Article;
import com.demo.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;

    @Override
    public List<Article> findAll() {
        return articleDao.findAll();
    }

    @Override
    public Article findById(Integer id) {
        return articleDao.findById(id).get();
    }

    @Override
    public void add(Article article) {
        articleDao.save(article);
    }

    @Override
    public void updae(Article article) {
        articleDao.save(article);
    }

    @Override
    public void deleteById(Integer id) {
        articleDao.deleteById(id);
    }
}
