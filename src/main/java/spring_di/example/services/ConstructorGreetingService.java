package spring_di.example.services;

import org.springframework.stereotype.Service;

@Service("constructorGreetingService")
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from service";
    }
}
