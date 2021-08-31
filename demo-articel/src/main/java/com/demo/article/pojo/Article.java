package com.demo.article.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_article")
@Data //使用该注解，相当于自动生成了getter和setter方法
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id自增
    private Integer id;
    private String title;
    private String content;
    private String author;
    private Date addTime;

}
