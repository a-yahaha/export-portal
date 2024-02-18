package com.aya.cloud.export.common.exception;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName BusinessExceptionBuilder
 * @description
 * @date created in 22:04 2023/8/12
 */
public class BusinessExceptionBuilder {

    public static BusinessException build(IErrorCode errorCode) {
        return new BusinessException(errorCode);
    }

    public static BusinessException build(IErrorCode errorCode, String msg) {
        return new BusinessException(errorCode, msg);
    }
}
