package com.an.tw.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.an.tw")
@EnableJpaRepositories(basePackages = "com.an.tw.infrastructure.repository")
@EntityScan(basePackages = "com.an.tw.infrastructure.entity")
public class EmotionBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmotionBackendApplication.class, args);
    }

}
