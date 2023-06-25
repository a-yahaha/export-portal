package com.aya.cloud.export.api.job.model.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName ExportJobResponse
 * @description
 * @date created in 22:29 2023/6/25
 */
@Data
public class ExportJobResponse implements Serializable {

    /**
     * 导出任务的id
     */
    private String jobId;
}
