package com.aya.cloud.export.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName JobStatusEnum
 * @description 任务状态描述
 * @date created in 22:09 2023/6/16
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum JobStatusEnum {

    INIT(1, "init", "初始化"),


    ;

    private int code;

    private String name;

    private String desc;


}
