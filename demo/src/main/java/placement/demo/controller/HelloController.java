package placement.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    Logger LOGGER = LoggerFactory.getLogger(HelloController.class.getSimpleName());
    @GetMapping("/hello/{name}")
    public String getAllBook(@PathVariable String name)
    {
        LOGGER.info("Recieved {}", name);
        return  "hello" + name;
    }

}
