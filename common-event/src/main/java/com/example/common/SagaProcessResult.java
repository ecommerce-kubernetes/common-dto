package com.example.common;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SagaProcessResult {
    private Long sagaId;
    private Long orderId;
    private SagaStatus status;
    private String errorCode;
    private String failureReason;

    @Builder(access = AccessLevel.PRIVATE)
    private SagaProcessResult(Long sagaId, Long orderId, SagaStatus status, String errorCode, String failureReason) {
        this.sagaId = sagaId;
        this.orderId = orderId;
        this.status = status;
        this.errorCode = errorCode;
        this.failureReason = failureReason;
    }

    public static SagaProcessResult success(Long sagaId, Long orderId) {
        return SagaProcessResult.builder()
                .sagaId(sagaId)
                .orderId(orderId)
                .status(SagaStatus.SUCCESS)
                .build();
    }

    public static SagaProcessResult fail(Long sagaId, Long orderId, String errorCode, String failureReason) {
        if(failureReason == null || failureReason.isEmpty()){
            throw new IllegalArgumentException("실패 메시지 생성시 실패 이유는 필수값입니다");
        }
        return SagaProcessResult.builder()
                .sagaId(sagaId)
                .orderId(orderId)
                .status(SagaStatus.FAIL)
                .errorCode(errorCode)
                .failureReason(failureReason)
                .build();
    }
}
