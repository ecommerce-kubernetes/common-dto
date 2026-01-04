package com.example.common.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class UserSagaCommand {
    private UserCommandType type;
    private Long sagaId;
    private String orderNo;
    private Long userId;
    private Long usedPoint;
    private LocalDateTime timestamp;

    @Builder
    private UserSagaCommand(UserCommandType type, Long sagaId, String orderNo, Long userId, Long usedPoint, LocalDateTime timestamp) {
        this.type = type;
        this.sagaId = sagaId;
        this.orderNo = orderNo;
        this.userId = userId;
        this.usedPoint = usedPoint;
        this.timestamp = timestamp;
    }

    public static UserSagaCommand of(UserCommandType type, Long sagaId, String orderNo, Long userId, Long usedPoint, LocalDateTime timestamp){
        return UserSagaCommand.builder()
                .type(type)
                .sagaId(sagaId)
                .orderNo(orderNo)
                .userId(userId)
                .usedPoint(usedPoint)
                .timestamp(timestamp)
                .build();
    }
}
