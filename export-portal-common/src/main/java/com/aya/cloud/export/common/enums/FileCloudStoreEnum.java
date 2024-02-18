package com.aya.cloud.export.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName FileCloudStoreEnum
 * @description
 * @date created in 10:53 2023/6/18
 */
@AllArgsConstructor
@Getter
public enum FileCloudStoreEnum {

    TECENT("TECENT", "腾讯云"),

    QINIU("QINIU", "七牛云"),

    ALi("ALi", "阿里云"),

    CUSTOMIZE("CUSTOMIZE", "自定义云存储")

    ;

    /**
     * 类型
     */
    private String type;

    /**
     * 文件秒速
     */
    private String desc;

    public static FileCloudStoreEnum of(String name) {
        return Arrays.stream(values())
                .filter(each -> StringUtils.equals(name, each.type))
                .findFirst()
                .orElse(null);
    }
}
