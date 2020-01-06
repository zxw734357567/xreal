package com.tmd.xreal;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.tmd.xreal.mapper")
@EnableCaching
public class XrealApplication {

    public static void main(String[] args) {
        SpringApplication.run(XrealApplication.class, args);
    }

}
