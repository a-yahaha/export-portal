package com.aya.cloud.export.api.job.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName Operator
 * @description 操作人信息
 * @date created in 21:53 2023/6/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operator implements Serializable {

    /**
     * 操作人的id
     */
    private Long id;

    /**
     * 操作人的名称
     */
    private String name;

    /**
     * 操作人的身份类型
     */
    private Integer type;
}
