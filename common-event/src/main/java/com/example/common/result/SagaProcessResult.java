package com.example.common.result;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SagaProcessResult {
    private Long sagaId;
    private Long orderId;
    private SagaEventStatus status;
    private String errorCode;
    private String failureReason;

    @Builder(access = AccessLevel.PRIVATE)
    private SagaProcessResult(Long sagaId, Long orderId, SagaEventStatus status, String errorCode, String failureReason) {
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
                .status(SagaEventStatus.SUCCESS)
                .build();
    }

    public static SagaProcessResult fail(Long sagaId, Long orderId, String errorCode, String failureReason) {
        return SagaProcessResult.builder()
                .sagaId(sagaId)
                .orderId(orderId)
                .status(SagaEventStatus.FAIL)
                .errorCode(errorCode)
                .failureReason(failureReason)
                .build();
    }
}
