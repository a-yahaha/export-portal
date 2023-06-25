package com.aya.cloud.export.domain.config.model;

import lombok.Data;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName FileModuleConfig
 * @description 文件模块的配置
 * @date created in 10:26 2023/6/18
 */
@Data
public class FileModuleConfig {

    /**
     * 导出的文件类型
     * @see com.aya.cloud.export.common.enums.FileFormatEnum
     */
    private Integer fileFormat;

    /**
     * csv的文件分割符
     * @see com.aya.cloud.export.common.enums.CSVDelimiterEnum
     */
    private Integer csvDelimiter;


    /**
     * 文件类型
     *  - 模版
     *  - 动态表头
     *
     * @see com.aya.cloud.export.common.enums.ExcelFileTypeEnum
     */
    private Integer excelFileType;

    /**
     * 文件模版id
     */
    private Long templateId;

    /**
     * 云文件存储类型
     * @see com.aya.cloud.export.common.enums.FileCloudStoreEnum
     */
    private Integer cloudStoreType;

    /**
     * 文件过期类型
     *
     */
    private Integer fileExpireType;

    /**
     * 过期的时间
     * 单位：分钟
     */
    private Long expireMinute;



}
