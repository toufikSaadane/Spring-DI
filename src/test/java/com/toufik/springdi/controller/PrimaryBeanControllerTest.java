package com.toufik.springdi.controller;

import com.toufik.springdi.service.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PrimaryBeanControllerTest {

    PrimaryBeanController primaryBeanController;

    @BeforeEach
    void setUp() {
        primaryBeanController = new PrimaryBeanController();
        primaryBeanController.greetingService = new PrimaryGreetingService();
    }

    @Test
    void getGreetingService() {

        String string = "Say hello! -- PRIMARY BEAN";
        System.out.println(primaryBeanController.getGreetingService());
        assertThat(primaryBeanController.getGreetingService()).isEqualTo(string);
    }
}