package com.example.common;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderProduct {
    private Long productVariantId;
    private int stock;
}
