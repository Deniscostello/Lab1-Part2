package ie.atu.hello2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
