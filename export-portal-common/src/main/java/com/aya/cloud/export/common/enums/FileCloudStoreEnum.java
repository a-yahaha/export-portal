package com.aya.cloud.export.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

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

    TECENT(1, "腾讯云"),

    QINIU(2, "七牛云"),

    ALi(3, "阿里云"),

    CUSTOMIZE(4, "自定义云存储")

    ;

    /**
     * 类型
     */
    private int type;

    /**
     * 文件秒速
     */
    private String desc;
}
