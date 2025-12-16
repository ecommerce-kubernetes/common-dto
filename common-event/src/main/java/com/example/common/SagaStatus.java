package com.example.common;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SagaStatus {
    SUCCESS("성공"),
    FAIL("실패");

    private final String name;
}
