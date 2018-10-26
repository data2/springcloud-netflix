package com.musteer.spring.cloud.eureka.consumer.client.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudEurekaConsumerApplication {
    @Autowired
    private RestTemplateBuilder builder;

    //ribbon需要配置，负载均衡
    //注入restTemplate @LoadBalanced注解表明这个restRemplate开启负载均衡的功能
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return builder.build();
    }

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringcloudEurekaConsumerApplication.class, args);
        System.in.read();

    }
}
