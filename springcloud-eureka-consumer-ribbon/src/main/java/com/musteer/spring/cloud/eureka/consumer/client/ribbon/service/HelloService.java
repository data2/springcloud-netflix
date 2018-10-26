package com.musteer.spring.cloud.eureka.consumer.client.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HelloService {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public LoadBalancerClient loadBalancerClient;

    @Value("${providerServiceUrl}")
    public String providerServiceUrl;

    public String hi(String name) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-provider");
        System.out.println(serviceInstance.getHost() + ":" + serviceInstance.getPort());
        return restTemplate.getForObject(providerServiceUrl.concat("/hi/").concat(name), String.class);
    }
}
