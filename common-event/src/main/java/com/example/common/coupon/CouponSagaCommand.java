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
    private String orderNo;
    private Long userId;
    private Long couponId;
    private LocalDateTime timestamp;

    @Builder
    private CouponSagaCommand(CouponCommandType type, Long sagaId, String orderNo, Long userId, Long couponId, LocalDateTime timestamp) {
        this.type = type;
        this.sagaId = sagaId;
        this.orderNo = orderNo;
        this.userId = userId;
        this.couponId = couponId;
        this.timestamp = timestamp;
    }

    public static CouponSagaCommand of(CouponCommandType type, Long sagaId, String orderNo, Long userId, Long couponId, LocalDateTime timestamp) {
        return CouponSagaCommand.builder()
                .type(type)
                .sagaId(sagaId)
                .orderNo(orderNo)
                .userId(userId)
                .couponId(couponId)
                .timestamp(timestamp)
                .build();
    }
}
