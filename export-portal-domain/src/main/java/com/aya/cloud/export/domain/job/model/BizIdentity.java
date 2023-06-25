package com.aya.cloud.export.domain.job.model;

import lombok.Data;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName BizIdentity
 * @description
 * @date created in 22:04 2023/6/16
 */
@Data
public class BizIdentity {

    /**
     * 业务身份标识
     */
    private String bizId;

    /**
     * 业务类型
     */
    private Integer type;
}
