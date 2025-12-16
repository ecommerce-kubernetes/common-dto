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
    private LocalDateTime timestamp;

    @Builder
    private CouponUseRequest(Long sagaId, Long orderId, Long userId, Long couponId, LocalDateTime timestamp) {
        this.sagaId = sagaId;
        this.orderId = orderId;
        this.userId = userId;
        this.couponId = couponId;
        this.timestamp = timestamp;
    }

    public static CouponUseRequest of(Long sagaId, Long orderId, Long userId, Long couponId, LocalDateTime timestamp) {
        return CouponUseRequest.builder()
                .sagaId(sagaId)
                .orderId(orderId)
                .userId(userId)
                .couponId(couponId)
                .timestamp(timestamp)
                .build();
    }
}
