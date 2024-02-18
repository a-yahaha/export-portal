package com.aya.cloud.export.domain.config.model;

import com.aya.cloud.export.common.enums.FileCloudStoreEnum;
import com.aya.cloud.export.common.enums.FileExpireEnum;
import com.aya.cloud.export.common.enums.FileFormatEnum;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName FileRuleEntity
 * @description  导出文件的规则
 * @date created in 20:45 2023/8/12
 */
public interface FileRule {

    /**
     * 文件格式
     * @return
     */
    FileFormatEnum getFileFormat();

    /**
     * 文件存储方式
     * @return
     */
    FileCloudStoreEnum getCloudStore();

    /**
     * 文件过期类型
     * @return
     */
    FileExpireEnum getFileExpireType();

    /**
     * 文件配置的过期分钟数
     * @return
     */
    Integer getExpireMinute();

    /**
     * 校验参数是否合法
     * @return
     */
    boolean validate();

}
