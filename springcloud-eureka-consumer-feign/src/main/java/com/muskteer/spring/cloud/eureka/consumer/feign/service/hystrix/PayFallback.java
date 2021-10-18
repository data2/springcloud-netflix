package com.muskteer.spring.cloud.eureka.consumer.feign.service.hystrix;

import com.data2.springcloud.api.pay.PayReq;
import com.data2.springcloud.api.pay.PayResp;
import com.muskteer.spring.cloud.eureka.consumer.feign.service.PayService;
import org.springframework.stereotype.Component;


@Component
public class PayFallback implements PayService {
    @Override
    public String health() {
        return "降级";
    }

    @Override
    public PayResp unipay(PayReq payReq) {
        return new PayResp(false, "降级", payReq.getOrderId(),null);
    }
}
