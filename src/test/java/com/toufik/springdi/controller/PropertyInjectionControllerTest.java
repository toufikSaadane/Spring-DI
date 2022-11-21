package com.toufik.springdi.controller;

import com.toufik.springdi.service.ConstructorGreetingService;
import com.toufik.springdi.service.PropertyGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp() {
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingService = new PropertyGreetingService();
    }

    @Test
    void greetingService() {
        String string = "Say hello! -- Property";
        System.out.println(propertyInjectionController.getGreetingService());
        assertThat(propertyInjectionController.getGreetingService()).isEqualTo(string);
    }
}