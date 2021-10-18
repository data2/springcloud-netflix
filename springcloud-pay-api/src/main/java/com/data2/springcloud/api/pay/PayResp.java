package com.data2.springcloud.api.pay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayResp {
    boolean paySuccess;
    String desc;
    String orderId;
    String payOrderId;
}
