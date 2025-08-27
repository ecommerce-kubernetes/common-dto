package com.example.common;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private Long productVariantId;
    private int stock;
    private int discountPrice;
}
