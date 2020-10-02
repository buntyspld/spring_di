package spring_di.example.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from SetterGreetingServiceImpl  service";
    }
}
