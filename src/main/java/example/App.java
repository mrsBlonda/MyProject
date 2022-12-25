package example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@RestController
@RequestMapping("/")
public class App {

    @GetMapping("/hello")
    public String hello() {
        return "Hello my friend";
    }

}

