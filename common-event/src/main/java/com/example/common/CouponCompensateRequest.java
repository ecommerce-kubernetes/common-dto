package com.example.common;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class CouponCompensateRequest {
    private Long sagaId;
    private Long orderId;
    private Long userId;
    private Long couponId;
    private LocalDateTime timestamp;

    @Builder
    private CouponCompensateRequest(Long sagaId, Long orderId, Long userId, Long couponId, LocalDateTime timestamp) {
        this.sagaId = sagaId;
        this.orderId = orderId;
        this.userId = userId;
        this.couponId = couponId;
        this.timestamp = timestamp;
    }

    public static CouponCompensateRequest of(Long sagaId, Long orderId, Long userId, Long couponId, LocalDateTime timestamp) {
        return CouponCompensateRequest.builder()
                .sagaId(sagaId)
                .orderId(orderId)
                .userId(userId)
                .couponId(couponId)
                .timestamp(timestamp)
                .build();
    }
}
