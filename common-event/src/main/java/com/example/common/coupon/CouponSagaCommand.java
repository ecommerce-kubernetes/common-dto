package com.example.common.coupon;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class CouponSagaCommand {
    private CouponCommandType type;
    private Long sagaId;
    private Long orderId;
    private Long userId;
    private Long couponId;
    private LocalDateTime timestamp;

    @Builder
    private CouponSagaCommand(CouponCommandType type, Long sagaId, Long orderId, Long userId, Long couponId, LocalDateTime timestamp) {
        this.type = type;
        this.sagaId = sagaId;
        this.orderId = orderId;
        this.userId = userId;
        this.couponId = couponId;
        this.timestamp = timestamp;
    }

    public static CouponSagaCommand of(CouponCommandType type, Long sagaId, Long orderId, Long userId, Long couponId, LocalDateTime timestamp) {
        return CouponSagaCommand.builder()
                .type(type)
                .sagaId(sagaId)
                .orderId(orderId)
                .userId(userId)
                .couponId(couponId)
                .timestamp(timestamp)
                .build();
    }
}
