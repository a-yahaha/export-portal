package com.aya.cloud.export.domain.config.model;

import lombok.Data;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName ExportConfig
 * @description 导出的任务配置
 * @date created in 22:28 2023/6/16
 */
public class ExportConfig {

    /**
     * 配置名称  用于做业务隔离
     *
     */
    private String configName;

    /**
     * 配置描述
     */
    private String configDesc;

    /**
     * 配置版本
     */
    private String version;

    // 业务的配置

    /**
     * 文件某块配置
     */
    private FileModuleConfig fileModule;
}
