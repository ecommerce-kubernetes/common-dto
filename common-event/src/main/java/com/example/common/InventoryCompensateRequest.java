package com.example.common;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
public class InventoryCompensateRequest {
    private Long sagaId;
    private Long orderId;
    private Long userId;
    private List<Item> items;
    private LocalDateTime timestamp;

    @Builder
    private InventoryCompensateRequest(Long sagaId, Long orderId, Long userId, List<Item> items, LocalDateTime timestamp) {
        this.sagaId = sagaId;
        this.orderId = orderId;
        this.userId = userId;
        this.items = items;
        this.timestamp = timestamp;
    }

    public static InventoryCompensateRequest of(Long sagaId, Long orderId, Long userId, List<Item> items, LocalDateTime timestamp) {
        return InventoryCompensateRequest.builder()
                .sagaId(sagaId)
                .orderId(orderId)
                .userId(userId)
                .items(items)
                .timestamp(timestamp)
                .build();
    }
}
