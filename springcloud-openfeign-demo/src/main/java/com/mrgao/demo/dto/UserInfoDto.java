package com.mrgao.demo.dto;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class UserInfoDto implements UserOperate {

    private String name;

    private Integer age;

    private String pwd;

}
