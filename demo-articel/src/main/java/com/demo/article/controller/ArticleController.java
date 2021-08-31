package com.demo.article.controller;

import com.demo.article.pojo.Article;
import com.demo.article.service.ArticleService;
import com.demo.article.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        return new Result(true, "查询成功", articleService.findAll());
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable Integer id) {
        return new Result(true, "查询成功", articleService.findById(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Article article) {
        articleService.add(article);
        return new Result(true, "添加成功");
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@RequestBody Article article, @PathVariable("id") Integer id) {
        article.setId(id);
        articleService.updae(article);
        return new Result(true,"修改成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable("id") Integer id) {
        articleService.deleteById(id);
        return new Result(true, "删除成功");
    }

}
