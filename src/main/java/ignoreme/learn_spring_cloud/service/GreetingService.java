package ignoreme.learn_spring_cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    private final String userName;

    @Autowired
    public GreetingService(@Value("${greetings.userName}") String userName) {
        this.userName = userName;
    }

    public String greet() {
        return "Hello, " + userName + "!";
    }

}
