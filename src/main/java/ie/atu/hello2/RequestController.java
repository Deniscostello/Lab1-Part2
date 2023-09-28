package ie.atu.hello2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/greet/{name}")
    public String name(@PathVariable String name ){
        return "Hello" + name;
    }

    @GetMapping("/details")
    public String name(@RequestParam int age, @RequestParam String name){
        return "Users age:" + age+ name;
    }

}