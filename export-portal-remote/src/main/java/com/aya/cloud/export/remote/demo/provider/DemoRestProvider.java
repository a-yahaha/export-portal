package com.aya.cloud.export.remote.demo.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName DemoRestProvider
 * @description
 * @date created in 23:06 2023/6/14
 */
@Component
@Slf4j
public class DemoRestProvider {

    public String sayDemo(String word) {
        return "say: " + word;
    }

}
