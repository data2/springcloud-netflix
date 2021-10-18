package com.musteer.spring.cloud.eureka.consumer.client.ribbon;

import com.musteer.spring.cloud.eureka.consumer.client.ribbon.config.RibbonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudEurekaConsumerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringcloudEurekaConsumerApplication.class, args);
    }
}
