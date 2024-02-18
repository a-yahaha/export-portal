package com.aya.cloud.export.domain.job.service;

import com.aya.cloud.export.domain.job.model.ExportJob;
import com.aya.cloud.export.domain.job.model.request.ExportJobRequest;
import org.springframework.stereotype.Service;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName ExportJobDomainService
 * @description 导出任务的领域服务
 * @date created in 19:54 2023/7/11
 */
@Service
public class ExportJobDomainService {

    /**
     * 提交导出任务
     * 异步导出
     * @param request
     * @return
     */
    public ExportJob submitJob(ExportJobRequest request) {

        // 1. 组装整个任务的上下文



        // 2. 拆解出整个导出任务的阶段 抽象

        // 3. 根据上下文和 阶段 组合出整个任务的执行过程

        return null;
    }
}
