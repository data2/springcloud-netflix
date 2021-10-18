package com.data2.springcloud.order.provider;

import com.data2.springcloud.api.order.OrderReq;
import com.data2.springcloud.api.order.OrderResp;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/health")
    public String health() {
        return "welcome , message from order provider 2";
    }

    @PostMapping("/order")
    @ResponseBody
    public OrderResp order(@RequestBody OrderReq orderReq) {
        return new OrderResp(true,"ok order provider2", UUID.randomUUID().toString());
    }
}
