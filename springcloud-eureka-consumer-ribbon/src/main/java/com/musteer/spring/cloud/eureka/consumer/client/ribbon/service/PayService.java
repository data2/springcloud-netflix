package com.musteer.spring.cloud.eureka.consumer.client.ribbon.service;

import com.data2.springcloud.api.pay.PayReq;
import com.data2.springcloud.api.pay.PayResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PayService {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public LoadBalancerClient loadBalancerClient;

    @Value("${payProviderServiceUrl}")
    public String providerServiceUrl;

    public PayResp unipay(PayReq payReq) {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-provider");
//        System.out.println(serviceInstance.getHost() + ":" + serviceInstance.getPort());
        return restTemplate.postForObject(providerServiceUrl.concat("/pay/unipay"), payReq, PayResp.class);
    }
}
