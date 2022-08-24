package com.csi.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
    @RequestMapping
    public String helloByYogesh(){
        return "welcome to yogeshwar's repo";
    }
}
