package com.aya.cloud.export.domain.config.model;

import lombok.Data;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName DataSourceConfig
 * @description 数据源配置
 * @date created in 20:32 2023/8/12
 */
@Data
public class DataSourceRule {

    /**
     * 数据的渠道
     *
     */
    private String channel;

    /**
     * 分页的方式
     */
    private Integer pageType;




}
