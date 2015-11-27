package ignoreme.learn_spring_cloud.web;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ignoreme.learn_spring_cloud.service.GreetingService;

@RunWith(MockitoJUnitRunner.class)
public class GreetingControllerTest {

    private GreetingController greetingController;

    @Mock
    private GreetingService greetingService;

    @Before
    public void setup() {
        greetingController = new GreetingController(greetingService);
    }

    @Test
    public void testControllerResponse() {
        String expected = "foo";
        when(greetingService.greet()).thenReturn(expected);

        String actual = greetingController.home();

        assertEquals(expected, actual);
    }

}
