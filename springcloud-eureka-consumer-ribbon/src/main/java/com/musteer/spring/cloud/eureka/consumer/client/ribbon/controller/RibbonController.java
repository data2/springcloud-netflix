package com.musteer.spring.cloud.eureka.consumer.client.ribbon.controller;

import com.data2.springcloud.api.order.OrderReq;
import com.data2.springcloud.api.order.OrderResp;
import com.data2.springcloud.api.pay.PayReq;
import com.data2.springcloud.api.pay.PayResp;
import com.musteer.spring.cloud.eureka.consumer.client.ribbon.service.OrderService;
import com.musteer.spring.cloud.eureka.consumer.client.ribbon.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RibbonController {

    @Autowired
    public PayService payService;

    @Autowired
    public OrderService orderService;

    @PostMapping("/do")
    @ResponseBody
    public PayResp doWork(@RequestBody OrderReq orderReq) {
        OrderResp res = orderService.order(orderReq);
        if (res.getOrderSuccess()) {
            PayReq payReq = new PayReq();
            payReq.setOrderId(res.getOrderId());
            return payService.unipay(payReq);
        }
        return new PayResp(false, "下单失败", "", "");
    }
}
