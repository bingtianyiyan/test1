package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
* Description:
* 启动类
*
* @author:ydy
* @create 2020/4/3 15:05
* @since 1.0.0
**/
@MapperScan("com.example.demo.service")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
