package com.muskteer.spring.cloud.eureka.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.io.IOException;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.muskteer.spring.cloud.eureka.consumer.feign.service")
public class SpringcloudEurekaConsumerFeignApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringcloudEurekaConsumerFeignApplication.class, args);
        System.in.read();
    }
}
