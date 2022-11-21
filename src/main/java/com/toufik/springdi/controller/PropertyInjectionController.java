package com.toufik.springdi.controller;

import com.toufik.springdi.service.GreetingService;
import com.toufik.springdi.service.PropertyGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    @Qualifier("propertyGreetingService")
    GreetingService greetingService;

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }
}
