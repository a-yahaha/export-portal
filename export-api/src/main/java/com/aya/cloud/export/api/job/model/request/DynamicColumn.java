package com.aya.cloud.export.api.job.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName DynamicColumn
 * @description 动态列，用于区分模版文件
 * @date created in 22:02 2023/6/25
 */
@Data
public class DynamicColumn implements Serializable {

    /**
     * key，与回调接口属性名相同
     */
    private String key;

    /**
     * 标题
     */
    private String title;

    /**
     * 列宽
     */
    private Integer width;

    /**
     * 顺序
     */
    private Integer order;
}
