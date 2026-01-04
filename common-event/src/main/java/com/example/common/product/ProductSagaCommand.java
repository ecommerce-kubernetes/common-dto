package com.example.common.product;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
public class ProductSagaCommand {
    private ProductCommandType type;
    private Long sagaId;
    private String orderNo;
    private Long userId;
    private List<Item> items;
    private LocalDateTime timestamp;

    @Builder
    private ProductSagaCommand(ProductCommandType type, Long sagaId, String orderNo, Long userId, List<Item> items, LocalDateTime timestamp) {
        this.type = type;
        this.sagaId = sagaId;
        this.orderNo = orderNo;
        this.userId = userId;
        this.items = items;
        this.timestamp = timestamp;
    }

    public static ProductSagaCommand of(ProductCommandType type, Long sagaId, String orderNo, Long userId, List<Item> items, LocalDateTime timestamp){
        return ProductSagaCommand.builder()
                .type(type)
                .sagaId(sagaId)
                .orderNo(orderNo)
                .userId(userId)
                .items(items)
                .timestamp(timestamp)
                .build();
    }
}
