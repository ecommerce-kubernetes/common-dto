package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PriceInfo {
    private long unitPrice;
    private int discountRate;
    private long discountAmount;
    private long finalPrice;
}
