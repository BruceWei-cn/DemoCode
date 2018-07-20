package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//扫描控制器类
@ComponentScan(basePackages="com.springboot")
//扫描dao
@MapperScan(basePackages="com.springboot.mapper")
public class SpringBootStart {
    public static void main(String [] args){
        SpringApplication.run(SpringBootStart.class,args);
    }
}
