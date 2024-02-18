package com.aya.cloud.export.domain.config.repository;

import com.aya.cloud.export.domain.config.model.ExportConfig;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName ExportConfigRepository
 * @description
 * @date created in 22:14 2023/8/12
 */
public interface ExportConfigRepository {

    /**
     * 获取配置
     * @param configKey
     * @return
     */
    ExportConfig getByConfigKey(String configKey);
}
