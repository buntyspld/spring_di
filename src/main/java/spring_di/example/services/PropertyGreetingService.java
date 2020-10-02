package spring_di.example.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from PropertyGreetingServiceImpl  service";
    }
}
