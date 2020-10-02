package spring_di.example.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring_di.example.services.GreetingService;
@Controller
public class ConstructorInjectedController {
    public final GreetingService greetingService;
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return new String("From Constructor Injected Controller ").concat(greetingService.sayGreeting());
    }
}
