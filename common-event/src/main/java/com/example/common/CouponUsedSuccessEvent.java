package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponUsedSuccessEvent {
    private Long orderId;
    private Long userCouponId;
    private DiscountType discountType;
    private int discountValue;
    private int minPurchaseAmount;
    private int maxDiscountAmount;
}