package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/avengers/assemble")
    public String chamion() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "la liste de toutes les villes où il y a une Wild Code School";
    }

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }
}
