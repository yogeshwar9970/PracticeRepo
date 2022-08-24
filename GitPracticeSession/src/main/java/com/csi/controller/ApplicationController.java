package com.csi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
    @GetMapping // I have changed from RequestMapping to GetMapping
    public String helloByYogesh(){
        return "welcome to yogeshwar's repo";
    }

    @GetMapping("/kk")
    public  String sayChange(){
        return "I have changed from @RequestMapping to @GetMapping";
    }
}
