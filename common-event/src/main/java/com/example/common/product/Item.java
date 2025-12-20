package com.example.common.product;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Item {
    private Long productVariantId;
    private Integer quantity;

    @Builder
    private Item(Long productVariantId, Integer quantity){
        this.productVariantId = productVariantId;
        this.quantity = quantity;
    }

    public static Item of(Long productVariantId, Integer quantity){
        return Item.builder()
                .productVariantId(productVariantId)
                .quantity(quantity)
                .build();
    }
}
