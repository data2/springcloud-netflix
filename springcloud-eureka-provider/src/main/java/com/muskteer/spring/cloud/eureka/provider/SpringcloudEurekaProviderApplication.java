package com.muskteer.spring.cloud.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringcloudEurekaProviderApplication.class,args);
        System.in.read();
    }
}
