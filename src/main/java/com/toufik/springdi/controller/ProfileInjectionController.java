package com.toufik.springdi.controller;

import com.toufik.springdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileInjectionController {

    @Autowired
    @Qualifier("i18nService")
    GreetingService greetingService;

    @Value("${value.from.file}")
    private String valueFromFile;

    public String getGreetingService() {
        return greetingService.sayGreeting()+ "\n" + valueFromFile;
    }
}
