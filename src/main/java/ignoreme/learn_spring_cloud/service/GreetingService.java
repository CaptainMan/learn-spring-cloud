package ignoreme.learn_spring_cloud.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public String greet() {
        return "Hello, World!";
    }

}
