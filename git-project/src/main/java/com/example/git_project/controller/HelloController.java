package com.example.git_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/{name}")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }
}
