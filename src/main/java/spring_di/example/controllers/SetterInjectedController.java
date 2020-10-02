package spring_di.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring_di.example.services.GreetingService;
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;
    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return new String("From Setter Injected Controller ").concat(greetingService.sayGreeting());
    }
}
