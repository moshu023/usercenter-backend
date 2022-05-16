package com.yhh.usercenterbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yhh.usercenterbackend.mapper")
public class UsercenterBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsercenterBackendApplication.class, args);
    }

}
