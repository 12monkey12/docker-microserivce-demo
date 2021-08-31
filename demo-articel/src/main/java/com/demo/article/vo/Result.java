package com.demo.article.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一返回数据实体类
 */
@Data
public class Result implements Serializable {

    private Boolean flag;//是否成功
    private String message;//消息
    private Object data;//返回数据

    public Result(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public Result(Boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }
}
