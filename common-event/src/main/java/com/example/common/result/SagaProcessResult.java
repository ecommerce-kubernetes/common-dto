package com.example.common.result;

import lombok.*;

@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class SagaProcessResult {
    private Long sagaId;
    private String orderNo;
    private SagaEventStatus status;
    private String errorCode;
    private String failureReason;

    @Builder(access = AccessLevel.PRIVATE)
    private SagaProcessResult(Long sagaId, String orderNo, SagaEventStatus status, String errorCode, String failureReason) {
        this.sagaId = sagaId;
        this.orderNo = orderNo;
        this.status = status;
        this.errorCode = errorCode;
        this.failureReason = failureReason;
    }

    public static SagaProcessResult success(Long sagaId, String orderNo) {
        return SagaProcessResult.builder()
                .sagaId(sagaId)
                .orderNo(orderNo)
                .status(SagaEventStatus.SUCCESS)
                .build();
    }

    public static SagaProcessResult fail(Long sagaId, String orderNo, String errorCode, String failureReason) {
        return SagaProcessResult.builder()
                .sagaId(sagaId)
                .orderNo(orderNo)
                .status(SagaEventStatus.FAIL)
                .errorCode(errorCode)
                .failureReason(failureReason)
                .build();
    }
}
