package com.aya.cloud.export.api.job.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName ExportTitle
 * @description 导出的标题
 * @date created in 21:52 2023/6/25
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface ExportTitle {
    String title() default "";

    int width() default 0;

    int order() default 100;
}
