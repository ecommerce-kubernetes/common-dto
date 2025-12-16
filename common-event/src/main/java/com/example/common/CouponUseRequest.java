package com.example.common;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class CouponUseRequest {
    private Long sagaId;
    private Long orderId;
    private Long userId;
    private Long couponId;
    private Long orderSubtotal;
    private Long discountAmount;
    private LocalDateTime timestamp;

    @Builder
    private CouponUseRequest(Long sagaId, Long orderId, Long userId, Long couponId, Long orderSubtotal, Long discountAmount, LocalDateTime timestamp) {
        this.sagaId = sagaId;
        this.orderId = orderId;
        this.userId = userId;
        this.couponId = couponId;
        this.orderSubtotal = orderSubtotal;
        this.discountAmount = discountAmount;
        this.timestamp = timestamp;
    }

    public static CouponUseRequest of(Long sagaId, Long orderId, Long userId, Long couponId, Long orderSubtotal,
                                      Long discountAmount, LocalDateTime timestamp) {
        return CouponUseRequest.builder()
                .sagaId(sagaId)
                .orderId(orderId)
                .userId(userId)
                .couponId(couponId)
                .orderSubtotal(orderSubtotal)
                .discountAmount(discountAmount)
                .timestamp(timestamp)
                .build();
    }
}
