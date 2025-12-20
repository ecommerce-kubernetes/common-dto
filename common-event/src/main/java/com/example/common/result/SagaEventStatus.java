package com.example.common.result;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SagaEventStatus {
    SUCCESS("성공"),
    FAIL("실패");

    private final String name;
}
