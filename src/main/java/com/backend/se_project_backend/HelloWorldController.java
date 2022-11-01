package com.backend.se_project_backend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldController {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }

    @GetMapping("/hello-world")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "from Andreea, Bori and Radu") String name) {
        return String.format("Hello %s!", name);
    }

}