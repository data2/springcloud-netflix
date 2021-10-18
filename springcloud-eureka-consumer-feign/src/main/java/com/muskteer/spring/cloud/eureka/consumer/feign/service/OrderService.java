package com.muskteer.spring.cloud.eureka.consumer.feign.service;

import com.data2.springcloud.api.order.OrderReq;
import com.data2.springcloud.api.order.OrderResp;
import com.data2.springcloud.api.pay.PayReq;
import com.data2.springcloud.api.pay.PayResp;
import com.muskteer.spring.cloud.eureka.consumer.feign.service.hystrix.OrderFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "order-provider", fallback = OrderFallBack.class ,path = "order")
public interface OrderService {

    @GetMapping("/health")
    String health();

    @PostMapping("/order")
    @ResponseBody
    OrderResp order(@RequestBody OrderReq orderReq);
}
