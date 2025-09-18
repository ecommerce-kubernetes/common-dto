package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductStockDeductedEvent implements SuccessSagaEvent{
    private Long orderId;
    private List<DeductedProduct> deductedProducts;
}
