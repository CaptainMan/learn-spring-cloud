package ignoreme.learn_spring_cloud.greeter.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingServiceTest {

    private String userName;

    private GreetingService greetingService;

    @Before
    public void setup() {
        userName = "someUserName";
        greetingService = new GreetingService(userName);
    }

    @Test
    public void testGreeting() {
        assertEquals("Hello, someUserName!", greetingService.greet());
    }

}
