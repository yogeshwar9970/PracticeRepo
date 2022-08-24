package com.csi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
    @GetMapping
    public String helloByYogesh(){
        return "welcome to yogeshwar's repo";
    }

    @GetMapping("/hello")
    public String helloByRanjit(){
        return "welcome to ranjit's repo";
    }
    
}
