package com.aya.cloud.export.common.exception;

import java.util.Objects;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName BusinessException
 * @description
 * @date created in 21:55 2023/8/12
 */
public class BusinessException extends RuntimeException  {

    private final int errorCode;
    private final String errorMsg;
    private final String subErrorCode;
    private final String subErrorMsg;

    public BusinessException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.errorMsg = message;
        this.subErrorCode = null;
        this.subErrorMsg = null;
    }

    public BusinessException(int errorCode, String message, int subErrorCode, String subErrorMsg) {
        super(message);
        this.errorCode = errorCode;
        this.errorMsg = message;
        this.subErrorCode = String.valueOf(subErrorCode);
        this.subErrorMsg = subErrorMsg;
    }

    public BusinessException(int errorCode, String message, String subErrorCode, String subErrorMsg) {
        super(message);
        this.errorCode = errorCode;
        this.errorMsg = message;
        this.subErrorCode = subErrorCode;
        this.subErrorMsg = subErrorMsg;
    }

    public BusinessException(int errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
        this.errorMsg = message;
        if (cause instanceof BusinessException) {
            BusinessException subException = (BusinessException)cause;
            this.subErrorCode = String.valueOf(subException.errorCode);
            this.subErrorMsg = subException.errorMsg;
        } else if (Objects.nonNull(cause)) {
            this.subErrorCode = cause.getClass().getSimpleName();
            this.subErrorMsg = cause.getMessage();
        } else {
            this.subErrorCode = null;
            this.subErrorMsg = null;
        }
    }

    public BusinessException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode.getCode();
        this.errorMsg = errorCode.getMessage();
        this.subErrorCode = null;
        this.subErrorMsg = null;
    }

    public BusinessException(IErrorCode errorCode, String message) {
        super(errorCode.getMessage());
        this.errorCode = errorCode.getCode();
        this.errorMsg = message;
        this.subErrorCode = null;
        this.subErrorMsg = null;
    }

    public BusinessException(IErrorCode errorCode, Throwable cause) {
        super(errorCode.getMessage(), cause);
        this.errorCode = errorCode.getCode();
        this.errorMsg = errorCode.getMessage();
        if (cause instanceof BusinessException) {
            BusinessException subException = (BusinessException)cause;
            this.subErrorCode = String.valueOf(subException.errorCode);
            this.subErrorMsg = subException.errorMsg;
        } else if (Objects.nonNull(cause)) {
            this.subErrorCode = cause.getClass().getSimpleName();
            this.subErrorMsg = cause.getMessage();
        } else {
            this.subErrorCode = null;
            this.subErrorMsg = null;
        }

    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getSubErrorCode() {
        return this.subErrorCode;
    }

    public String getSubErrorMsg() {
        return this.subErrorMsg;
    }
}
