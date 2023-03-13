package com.mrgao.demo.client;


import com.mrgao.demo.config.Encoder;
import com.mrgao.demo.dto.BaseResMessage;
import com.mrgao.demo.dto.UserInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(url = "${gateway.requestUrl}",configuration = Encoder.class,name = "userFeignClient")
public interface UserFeignClient {

    /**
     * 修改用户信息
     *
     * @param userInfoDto
     * @return
     */
    @PostMapping
    BaseResMessage<Boolean> editUserInfo(@RequestBody UserInfoDto userInfoDto);
}
