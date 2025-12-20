package com.example.common.user;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum UserCommandType {
    USE_POINT("포인트 차감"),
    REFUND_POINT("포인트 복구");

    private final String name;
}
