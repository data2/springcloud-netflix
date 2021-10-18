package com.muskteer.spring.cloud.eureka.provider;
import com.data2.springcloud.api.pay.PayReq;
import com.data2.springcloud.api.pay.PayResp;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/pay")
public class PayController {
    @GetMapping("/health")
    public String health() {
        return "welcome , message from pay provider";
    }

    @PostMapping("/unipay")
    @ResponseBody
    public PayResp unipay(@RequestBody PayReq payReq) {
        return new PayResp(true,"支付成功，from 服务2",payReq.getOrderId(), UUID.randomUUID().toString());
    }
}
