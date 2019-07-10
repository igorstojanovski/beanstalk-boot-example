package org.igorski.beanstalkbootexample.org.igorski.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class Greetings {

    @GetMapping
    public String getHello() {
        return "Hello World!";
    }

}
