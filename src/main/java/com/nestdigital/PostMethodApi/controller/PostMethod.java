package com.nestdigital.PostMethodApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;

@RestController

public class PostMethod {
    @PostMapping("/")
    public String Readpage(){
        return "Readpage";
    }
    @PostMapping("/home")
    public String Homepage() {
        return "Welcome to home page";
    }

}