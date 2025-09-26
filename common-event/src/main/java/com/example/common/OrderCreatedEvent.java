package com.example.common;


import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderCreatedEvent {
    private Long orderId;
    private Long userId;
    private Long userCouponId;
    private List<OrderProduct> orderProductList;
    private boolean pointUsage;
    private long reservedPointAmount;
    private long reservedCashAmount;
    private long expectTotalAmount;
}