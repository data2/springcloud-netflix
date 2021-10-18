package com.muskteer.spring.cloud.eureka.consumer.feign.service.hystrix;

import com.data2.springcloud.api.order.OrderReq;
import com.data2.springcloud.api.order.OrderResp;
import com.muskteer.spring.cloud.eureka.consumer.feign.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderFallBack implements OrderService {
    @Override
    public String health() {
        return "降级了，不health";
    }

    @Override
    public OrderResp order(OrderReq orderReq) {
        return new OrderResp(false,"降级",null);
    }
}
