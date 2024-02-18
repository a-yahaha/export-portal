package com.aya.cloud.export.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Objects;

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

    PERMANENT(1, "PERMANENT", "永久有效"),

    LIMITED_TIME(2,"LIMITED_TIME", "限时有效"),


    ;

    private int code;

    private String name;

    private String desc;

    public boolean isPermanent() {
        return Objects.equals(code, PERMANENT.code);
    }

    public static FileExpireEnum of(String name) {
        return Arrays.stream(values())
                .filter(each -> StringUtils.equals(name, each.name))
                .findFirst()
                .orElse(null);
    }
}
