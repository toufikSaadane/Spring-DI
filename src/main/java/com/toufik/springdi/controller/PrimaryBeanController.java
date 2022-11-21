package com.toufik.springdi.controller;

import com.toufik.springdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {

    @Autowired
    GreetingService greetingService;

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }
}
