package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponUseFailedEvent {
    private Long orderId;
    private Long userId;
    private Integer reservedCacheAmount;
    private String reason;
}