package com.aya.cloud.export.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName CSVDelimiterEnum
 * @description csv文件的分割符
 * @date created in 10:36 2023/6/18
 */
@AllArgsConstructor
@Getter
public enum CSVDelimiterEnum {

    comma(1, ",", "逗号"),

    semicolon(2, ";", "分号"),

    colon(3, ":", "冒号"),



    ;

    private int code;

    private String delimiter;

    private String desc;
}
