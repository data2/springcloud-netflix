package com.muskteer.spring.cloud.eureka.consumer.feign.controller;

import com.data2.springcloud.api.order.OrderReq;
import com.data2.springcloud.api.order.OrderResp;
import com.data2.springcloud.api.pay.PayReq;
import com.data2.springcloud.api.pay.PayResp;
import com.muskteer.spring.cloud.eureka.consumer.feign.service.OrderService;
import com.muskteer.spring.cloud.eureka.consumer.feign.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class FeignController {

    @Autowired
    PayService payService;

    @Autowired
    OrderService orderService;

    @PostMapping(path = "do",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PayResp pay(@RequestBody OrderReq r) {
        OrderResp res = orderService.order(r);
        if (res.getOrderSuccess()) {
            PayReq payReq = new PayReq();
            payReq.setOrderId(res.getOrderId());
            return payService.unipay(payReq);
        }
        return new PayResp(false, StringUtils.isEmpty(res.getDesc())?"下单失败":res.getDesc(), "", "");
    }
}
