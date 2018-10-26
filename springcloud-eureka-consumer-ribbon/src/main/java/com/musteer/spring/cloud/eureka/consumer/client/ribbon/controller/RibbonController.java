package com.musteer.spring.cloud.eureka.consumer.client.ribbon.controller;

import com.musteer.spring.cloud.eureka.consumer.client.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    public HelloService helloService;

    @GetMapping("/hi/{name}")
    public String callProvider(@PathVariable("name") String name) {
        return "call provider return : ".concat(helloService.hi(name));
    }
}
