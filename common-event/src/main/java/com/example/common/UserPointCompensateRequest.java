package com.example.common;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class UserPointCompensateRequest {
    private Long sagaId;
    private Long orderId;
    private Long userId;
    private Long refundedPoint;
    private LocalDateTime timestamp;

    @Builder
    private UserPointCompensateRequest(Long sagaId, Long orderId, Long userId, Long refundedPoint, LocalDateTime timestamp) {
        this.sagaId = sagaId;
        this.orderId = orderId;
        this.userId = userId;
        this.refundedPoint = refundedPoint;
        this.timestamp = timestamp;
    }

    public static UserPointCompensateRequest of(Long sagaId, Long orderId, Long userId, Long refundedPoint, LocalDateTime timestamp) {
        return UserPointCompensateRequest.builder()
                .sagaId(sagaId)
                .orderId(orderId)
                .userId(userId)
                .refundedPoint(refundedPoint)
                .timestamp(timestamp)
                .build();
    }
}
