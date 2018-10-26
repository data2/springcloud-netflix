package com.muskteer.spring.cloud.eureka.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("eureka-provider")
public interface HelloService {

    @GetMapping("/hi/{name}")
    String hi(@PathVariable("name") String name);
}
