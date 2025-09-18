package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCashDeductedEvent implements SuccessSagaEvent{
    private Long orderId;
    private Long userId;
    private boolean pointUsage;
    private int reservedPointAmount;
    private int reservedCashAmount;
    private int expectTotalAmount;
}