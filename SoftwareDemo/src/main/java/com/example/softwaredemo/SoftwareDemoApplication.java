package com.example.softwaredemo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.softwaredemo.demos.web.mapper")
public class SoftwareDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoftwareDemoApplication.class, args);
    }

}
