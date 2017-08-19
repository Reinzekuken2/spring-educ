package hello.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 19.08.2017.
 */
@RestController
public class HelloWorldResource {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
