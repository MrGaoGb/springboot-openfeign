package com.mrgao.demo.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class BaseResMessage<T> implements Serializable {

    private String code;

    private String message;

    private T data;

    public BaseResMessage(T data) {
        this.code = "00";
        this.message = "操作成功!";
        this.data = data;
    }
}
