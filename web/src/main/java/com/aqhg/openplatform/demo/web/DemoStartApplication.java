package com.aqhg.openplatform.demo.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.aqhg.openplatform.demo.dal.tunnel.datatunnel")
@ComponentScan({"com.aqhg.openplatform.demo.*"})
public class DemoStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoStartApplication.class, args);
    }
}
