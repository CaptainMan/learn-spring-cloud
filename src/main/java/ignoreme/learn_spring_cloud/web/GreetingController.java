package ignoreme.learn_spring_cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ignoreme.learn_spring_cloud.service.GreetingService;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return greetingService.greet();
    }

}
