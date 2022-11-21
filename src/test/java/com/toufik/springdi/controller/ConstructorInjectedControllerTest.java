package com.toufik.springdi.controller;

import com.toufik.springdi.service.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreetingService() {
        String string = "Say hello! -- construct";
        System.out.println(constructorInjectedController.getGreetingService());
        assertThat(constructorInjectedController.getGreetingService()).isEqualTo(string);
    }
}