package spring_di.example.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring_di.example.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }


    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
        ;
    }
}