package com.example.mybatis.demo06;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mybatis.demo06")
@SpringBootApplication
class demo06Application {
    public static void main(String[] args) {
        SpringApplication.run(demo06Application.class, args);
    }

}
