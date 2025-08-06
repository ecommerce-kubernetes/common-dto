package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCacheReserveEvent {
    private Long orderId;
    private Long userId;
    private Long userCouponId;
    private Integer reservedCacheAmount;

}