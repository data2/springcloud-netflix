package com.data2.springcloud.order.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudOrderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringcloudOrderApplication.class,args);
    }
}
