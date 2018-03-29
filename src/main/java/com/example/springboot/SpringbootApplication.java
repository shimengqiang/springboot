package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

    static ConfigurableApplicationContext context;

	public static void main(String[] args) {
        context = SpringApplication.run(SpringbootApplication.class, args);
    }



}
