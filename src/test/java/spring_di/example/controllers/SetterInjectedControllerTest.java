package spring_di.example.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring_di.example.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructorGreetingService());
    }


    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
        ;
    }
}