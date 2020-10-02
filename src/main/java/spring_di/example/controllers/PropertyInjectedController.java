package spring_di.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring_di.example.services.GreetingService;
@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyGreetingService")
    public GreetingService greetingService;
    public String getGreeting(){
        return new String("From Property Injected Controller ").concat(greetingService.sayGreeting());
    }

}
