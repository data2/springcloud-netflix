package com.muskteer.spring.cloud.eureka.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.io.IOException;

@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.muskteer.spring.cloud.eureka.consumer.feign.service")
public class SpringcloudEurekaConsumerFeignApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringcloudEurekaConsumerFeignApplication.class, args);
        System.in.read();
    }
}
