package com.an.tw.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.an.tw")
public class EmotionBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmotionBackendApplication.class, args);
    }

}