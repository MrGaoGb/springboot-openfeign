package com.mrgao.demo.controller;


import com.mrgao.demo.dto.BaseResMessage;
import com.mrgao.demo.dto.ChannelReqParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 用户控制器
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {


    @PostMapping("/editInfo")
    public BaseResMessage<Boolean> edit(@RequestBody ChannelReqParam channelReqParam) {
        log.info("【修改用户基本信息】 请求参数: param:{}", channelReqParam);
        try {
            TimeUnit.SECONDS.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("【修改用户基本信息】 修改成功!");
        return new BaseResMessage<>(Boolean.TRUE);
    }

}
