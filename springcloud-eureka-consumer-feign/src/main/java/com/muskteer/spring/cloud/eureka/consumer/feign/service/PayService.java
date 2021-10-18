package com.muskteer.spring.cloud.eureka.consumer.feign.service;

import com.data2.springcloud.api.pay.PayReq;
import com.data2.springcloud.api.pay.PayResp;
import com.muskteer.spring.cloud.eureka.consumer.feign.service.hystrix.PayFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "pay-provider",fallback = PayFallback.class, path = "pay")
public interface PayService {

    @GetMapping("/health")
    String health();

    @PostMapping("/unipay")
    @ResponseBody
    PayResp unipay(@RequestBody PayReq helloReq);
}
