package ignoreme.learn_spring_cloud.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GreetingServiceTest {

    private GreetingService greetingService;

    @Before
    public void setup() {
        greetingService = new GreetingService();
    }

    @Test
    public void testGreeting() {
        assertEquals("Hello, World!", greetingService.greet());
    }

}
