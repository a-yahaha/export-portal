package com.aya.cloud.export.domain.job.model;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName Job
 * @description 任务
 * @date created in 22:03 2023/6/16
 */
public interface Job {

    /**
     * 任务的标识
     * @return
     */
    String getJobId();

    /**
     * 获取业务身份标识
     * 用来隔离身份
     * @return
     */
    BizIdentity getBizIndentity();




}
