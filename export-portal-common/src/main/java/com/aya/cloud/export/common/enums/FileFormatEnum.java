package com.aya.cloud.export.common.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName FileFormatEnum
 * @description
 * @date created in 10:33 2023/6/18
 */

@AllArgsConstructor
@Getter
public enum FileFormatEnum {

    CSV(1, "csv"),

    EXCEL(2, "excel"),

    TXT(3, "txt"),

    ;

    private int code;

    private String desc;
}
