package com.aya.cloud.export.common.util;

import com.aya.cloud.export.common.exception.BusinessException;
import com.aya.cloud.export.common.exception.BusinessExceptionBuilder;
import com.aya.cloud.export.common.exception.IErrorCode;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName AssertUtils
 * @description
 * @date created in 22:03 2023/8/12
 */
public class AssertUtils {

    public AssertUtils() {
    }

    public static void assertTrue(boolean condition, BusinessException e) {
        if (!condition) {
            throw e;
        }
    }

    public static void assertTrue(boolean condition, IErrorCode errorCode) {
        if (!condition) {
            throw BusinessExceptionBuilder.build(errorCode);
        }
    }

    public static void assertTrue(boolean condition, IErrorCode errorCode, String msg) {
        if (!condition) {
            throw BusinessExceptionBuilder.build(errorCode, msg);
        }
    }

    public static void assertIntegerGTZero(Integer value, IErrorCode errorCode) {
        if (Objects.isNull(value) || value <= 0) {
            throw BusinessExceptionBuilder.build(errorCode);
        }
    }

    public static void assertNotNull(Object target, BusinessException e) {
        if (Objects.isNull(target)) {
            throw e;
        }
    }

    public static void assertNotNull(Object target, IErrorCode errorCode) {
        if (Objects.isNull(target)) {
            throw BusinessExceptionBuilder.build(errorCode);
        }
    }

    public static void assertNotNull(Object target, IErrorCode errorCode, String msg) {
        if (Objects.isNull(target)) {
            throw BusinessExceptionBuilder.build(errorCode, msg);
        }
    }

    public static void assertNotBlank(String str, BusinessException e) {
        if (StringUtils.isBlank(str)) {
            throw e;
        }
    }

    public static void assertNotBlank(String str, IErrorCode errorCode) {
        if (StringUtils.isBlank(str)) {
            throw BusinessExceptionBuilder.build(errorCode);
        }
    }

    public static void assertNotBlank(String str, IErrorCode errorCode, String msg) {
        if (StringUtils.isBlank(str)) {
            throw BusinessExceptionBuilder.build(errorCode, msg);
        }
    }
}
