package com.musteer.spring.cloud.eureka.consumer.client.ribbon.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {

    @Autowired
    private RestTemplateBuilder builder;

    //ribbon需要配置，负载均衡
    //注入restTemplate @LoadBalanced注解表明这个restRemplate开启负载均衡的功能
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return builder.build();
    }

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
