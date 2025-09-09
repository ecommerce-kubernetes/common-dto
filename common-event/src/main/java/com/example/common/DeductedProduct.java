package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DeductedProduct {
    private Long productId;
    private Long productVariantId;
    private String productName;
    private String thumbnail;
    private PriceInfo priceInfo;
    private int quantity;
    private List<ItemOption> options;
}
