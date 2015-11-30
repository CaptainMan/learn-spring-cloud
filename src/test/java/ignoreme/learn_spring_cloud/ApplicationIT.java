package ignoreme.learn_spring_cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest
public class ApplicationIT {

    @Test
    public void testHomeGreeting() {
        ResponseEntity<String> response = new TestRestTemplate().getForEntity("http://localhost:8080", String.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Hello, Bill!", response.getBody());
    }

}
