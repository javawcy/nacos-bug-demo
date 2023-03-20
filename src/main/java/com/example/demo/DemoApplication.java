package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@Component
@RefreshScope
class StartUpCommand implements CommandLineRunner {
    @Value("${xxx}")
    private String xxx;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(xxx);
    }
}
