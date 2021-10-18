package com.musteer.spring.cloud.eureka.consumer.client.ribbon.service;

import com.data2.springcloud.api.order.OrderReq;
import com.data2.springcloud.api.order.OrderResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class OrderService {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public LoadBalancerClient loadBalancerClient;

    @Value("${orderProviderServiceUrl}")
    public String providerServiceUrl;

    public OrderResp order(OrderReq orderReq) {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-provider");
//        System.out.println(serviceInstance.getHost() + ":" + serviceInstance.getPort());
        return restTemplate.postForObject(providerServiceUrl.concat("/order/order"),orderReq, OrderResp.class);
    }
}
