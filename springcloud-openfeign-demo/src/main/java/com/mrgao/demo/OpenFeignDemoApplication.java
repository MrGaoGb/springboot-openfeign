package com.mrgao.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.mrgao.demo.client"})
public class OpenFeignDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignDemoApplication.class, args);
    }

}
