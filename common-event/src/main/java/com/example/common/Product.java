package com.example.common;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private Long productId;
    private int count;
    private int discountPrice;
}
