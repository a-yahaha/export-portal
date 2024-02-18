package com.aya.cloud.export.common.exception;

import lombok.AllArgsConstructor;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName ConfigErrorCode
 * @description 配置的异常
 * @date created in 21:58 2023/8/12
 */
@AllArgsConstructor
public enum ConfigErrorCode implements IErrorCode {

    CSV_DELIMITER_ERROR(1000_1001, "csv文件分割符异常"),

    CLOUD_STORE_ERROR(1000_1002, "云文件存储类型异常"),

    FILE_EXPIRE_TYPE_ERROR(1000_1003, "文件有效类型异常"),

    FILE_EXPIRE_MINUTE_ERROR(1000_1004, "文件有效时间不合法"),

    ;

    private int code;

    private String message;
    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
