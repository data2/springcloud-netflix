package com.muskteer.spring.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.io.IOException;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(EurekaServer.class,args);
        System.in.read();
    }
}
