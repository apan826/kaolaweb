package com.example.kaolaweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ContentController {
    @RequestMapping("/content.html")
    public String hello() {
        return "aaa";
    }
}