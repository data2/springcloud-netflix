package com.muskteer.spring.cloud.eureka.consumer.feign.controller;

import com.muskteer.spring.cloud.eureka.consumer.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return "feign consumer call provider return : ".concat(helloService.hi(name));
    }


}
