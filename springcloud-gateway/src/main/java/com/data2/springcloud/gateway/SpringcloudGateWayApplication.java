package com.data2.springcloud.gateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.IOException;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGateWayApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringcloudGateWayApplication.class, args);
        System.in.read();
    }
}
