package com.example.memelandia.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.memelandia.repositories;")
@EntityScan(basePackages = "com.example.memelandia.repositories")
public class MemelandiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemelandiaApplication.class, args);
    }

}