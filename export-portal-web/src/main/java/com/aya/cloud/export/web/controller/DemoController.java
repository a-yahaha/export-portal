package com.aya.cloud.export.web.controller;

import com.aya.cloud.export.remote.demo.provider.DemoRestProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yajun
 * @version 1.0.0
 * @ClassName DemoController
 * @description
 * @date created in 22:55 2023/6/14
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoRestProvider demoRestProvider;

    @GetMapping("/say")
    public String say(@RequestParam("word") String word) {
        return demoRestProvider.sayDemo(word);
    }
}
