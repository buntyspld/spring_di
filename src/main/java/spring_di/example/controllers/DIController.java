package spring_di.example.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class DIController {
    public String sayHello(){
        System.out.println("Hello World!!!..");
        return "Hi Folks....";
    }
}
