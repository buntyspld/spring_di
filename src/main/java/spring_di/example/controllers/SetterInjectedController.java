package spring_di.example.controllers;

import spring_di.example.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return new String("From Setter Injected Controller ").concat(greetingService.sayGreeting());
    }
}
