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

    CSV("CSV", "csv"),

    EXCEL("EXCEL", "excel"),

    TXT("TXT", "txt"),

    ;

    private String name;

    private String desc;
}
