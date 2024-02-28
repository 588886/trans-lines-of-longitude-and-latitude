package com.example.simplePage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello() {
        return "home";
    }

    @GetMapping("/keyword")
    public String keyword() {
        
        return "keywordHome";
    }

}
