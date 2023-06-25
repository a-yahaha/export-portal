package com.aya.cloud.export.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName FileExpireEnum
 * @description
 * @date created in 10:59 2023/6/18
 */
@AllArgsConstructor
@Getter
public enum FileExpireEnum {

    PERMANENT(1, "永久有效"),

    LIMITED_TIME(2, "限时有效"),


    ;

    private int code;

    private String name;
}
