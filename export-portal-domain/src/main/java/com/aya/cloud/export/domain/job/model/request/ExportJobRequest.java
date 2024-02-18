package com.aya.cloud.export.domain.job.model.request;

import com.aya.cloud.export.domain.job.model.BizIdentity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName ExportJobRequest
 * @description 导出任务的请求
 * @date created in 19:56 2023/7/11
 */
@Data
public class ExportJobRequest implements Serializable {

    /**
     * 导出配置的任务key
     */
    private String configKey;

    /**
     * 业务省份标识
     */
    private BizIdentity bizIdentity;

}
