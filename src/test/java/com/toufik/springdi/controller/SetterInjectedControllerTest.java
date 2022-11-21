package com.toufik.springdi.controller;

import com.toufik.springdi.service.ConstructorGreetingService;
import com.toufik.springdi.service.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new SetterGreetingService());
    }

    @Test
    void getGreetingService() {

        String string = "Say hello! -- Setter";
        System.out.println(setterInjectedController.getGreetingService());
        assertThat(setterInjectedController.getGreetingService()).isEqualTo(string);
    }
}