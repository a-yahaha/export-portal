package com.aya.cloud.export.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName FileTypeEnum
 * @description
 * @date created in 10:46 2023/6/18
 */
@AllArgsConstructor
@Getter
public enum ExcelFileTypeEnum {

    TEMPLATE(1, "文件模版"),

    DYNAMIC_COLUMN(2, "动态表头"),

    ;

    private int type;

    private String desc;
}
