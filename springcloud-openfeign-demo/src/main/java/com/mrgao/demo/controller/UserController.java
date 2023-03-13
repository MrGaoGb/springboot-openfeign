package com.mrgao.demo.controller;

import com.mrgao.demo.client.UserFeignClient;
import com.mrgao.demo.dto.BaseResMessage;
import com.mrgao.demo.dto.UserInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;


    @GetMapping("/editUser")
    public String editUser() {
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setName("高玉龙");
        userInfoDto.setAge(40);
        userInfoDto.setPwd("123456");
        BaseResMessage<Boolean> resMessage = userFeignClient.editUserInfo(userInfoDto);
        log.info("渠道响应信息:resMessage:{}", resMessage);
        return "操作成功!";
    }

}
