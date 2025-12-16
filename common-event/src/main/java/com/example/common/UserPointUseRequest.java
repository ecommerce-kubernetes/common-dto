package com.example.common;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class UserPointUseRequest {
    private Long sagaId;
    private Long orderId;
    private Long userId;
    private Long usedPoint;
    private String reason;
    private LocalDateTime timestamp;

    @Builder
    private UserPointUseRequest(Long sagaId, Long orderId, Long userId, Long usedPoint, String reason, LocalDateTime timestamp) {
        this.sagaId = sagaId;
        this.orderId = orderId;
        this.userId = userId;
        this.usedPoint = usedPoint;
        this.reason = reason;
        this.timestamp = timestamp;
    }

    public static UserPointUseRequest of(Long sagaId, Long orderId, Long userId, Long usedPoint,
                                         String reason, LocalDateTime timestamp) {
        return UserPointUseRequest.builder()
                .sagaId(sagaId)
                .orderId(orderId)
                .userId(userId)
                .usedPoint(usedPoint)
                .reason(reason)
                .timestamp(timestamp)
                .build();
    }
}
