package com.tmd.xreal;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tmd.xreal.mapper")
public class XrealApplication {

    public static void main(String[] args) {
        SpringApplication.run(XrealApplication.class, args);
    }

}
