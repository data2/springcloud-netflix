package com.muskteer.spring.cloud.eureka.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return "welcome , ".concat(name).concat(" form eureka provider");
    }
}
