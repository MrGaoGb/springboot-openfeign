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
}
