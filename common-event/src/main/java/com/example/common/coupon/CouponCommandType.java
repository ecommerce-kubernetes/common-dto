package com.example.common.coupon;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CouponCommandType {
    USE_COUPON("쿠폰 사용"),
    CANCEL_USE("사용 취소");

    private final String name;
}
