package com.data2.springcloud.api.pay;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class PayReq {
    String orderId;
    BigDecimal payMoney;
}
