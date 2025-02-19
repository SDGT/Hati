package com.example.hellokubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloKubernetesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloKubernetesApplication.class, args);
    }

    @RestController
    public class HelloController {
        @GetMapping("/message")
        public String welcome() {
            return "Hello, Welcome to Kubernetes!";
        }
    }
}
