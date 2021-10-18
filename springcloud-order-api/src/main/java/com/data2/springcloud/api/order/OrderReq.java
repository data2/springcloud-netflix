package com.data2.springcloud.api.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderReq {
    String userId;
    String product;
    String money;
    Date orderDate;
}
