package com.musteer.spring.cloud.eureka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.PathParam;

@RestController
public class RibbonController {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public LoadBalancerClient loadBalancerClient;

    @GetMapping("/hi/{name}")
    public String callProvider(@PathVariable("name") String name){
        String res = restTemplate.getForObject("http://eureka-provider/hi/".concat(name), String.class);
        return "call provider return : ".concat(res);
    }
}
