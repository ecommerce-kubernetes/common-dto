package com.example.common.product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ProductCommandType {
    DEDUCT_STOCK("재고 차감"),
    RESTORE_STOCK("재고 복구");
    private final String name;
}
