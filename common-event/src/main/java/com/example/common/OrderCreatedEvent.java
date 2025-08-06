package com.example.common;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderCreatedEvent {
    private Long orderId;
    private Long userId;
    private Long userCouponId;
    private Integer reservedCacheAmount;

}