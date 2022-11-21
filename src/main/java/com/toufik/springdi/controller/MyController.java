package com.toufik.springdi.controller;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello :" + this.getClass().getName());
        return "Hi folks!";
    }
}
