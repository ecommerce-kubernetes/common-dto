package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCacheDeductedEvent {
    private Long orderId;
    private Long userId;
    private boolean pointUsage;
    private int reservedPointAmount;
    private int reservedCacheAmount;
    private int expectTotalAmount;
}