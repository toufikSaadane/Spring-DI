package com.toufik.springdi.controller;

import com.toufik.pets.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    @Autowired
    PetService petService;


    public String getGreetingService() {
        return petService.getPetType();
    }
}
