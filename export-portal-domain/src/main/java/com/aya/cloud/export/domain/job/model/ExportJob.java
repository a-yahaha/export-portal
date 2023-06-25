package com.aya.cloud.export.domain.job.model;

import com.aya.cloud.export.domain.config.model.ExportConfig;
import lombok.Data;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName ExportJob
 * @description
 * @date created in 22:03 2023/6/16
 */
@Data
public class ExportJob {

    /**
     * 任务的唯一标识
     */
    private String jobId;

    /**
     * 获取业务身份标识 隔离身份
     */
    private BizIdentity bizIdentity;

    /**
     * 导出任务的配置
     */
    private ExportConfig exportConfig;

    /**
     * 导出任务的状态
     */
    private Integer status;





}
