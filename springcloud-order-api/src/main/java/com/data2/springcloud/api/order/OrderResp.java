package com.data2.springcloud.api.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResp {
    Boolean orderSuccess;
    String desc;
    String orderId;
}
