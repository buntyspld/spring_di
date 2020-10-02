package spring_di.example.controllers;

import spring_di.example.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return new String("From Constructor Injected Controller ").concat(greetingService.sayGreeting());
    }
}
