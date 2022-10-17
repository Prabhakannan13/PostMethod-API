package com.nestdigital.PostMethodApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
    @GetMapping("/viewall")
    public List Viewall(){
        List<String> myList=new ArrayList<>();
        myList.add("{'name':prabha,'age':20}");
        return myList;
    }
    @GetMapping("/name")
public String name(){
        return "Prabha";
}
}