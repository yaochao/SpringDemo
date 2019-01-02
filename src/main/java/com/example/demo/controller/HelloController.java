package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaochao on 2018/12/17 下午4:49
 */
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${com.baidu.site}")
    private String baiduSite;

    @ApiOperation(value = "首页", notes = "获取首页的数据")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "hello world";
    }

    @ApiOperation(value = "百度地址", notes = "获取百度地址")
    @RequestMapping(value = "/baidu", method = RequestMethod.GET)
    public String baidu() {
        return baiduSite;
    }

    @ApiOperation(value = "问候", notes = "你好xxx")
    @RequestMapping(value="/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam("gg") String name) {
        return "你好," + name;
    }

    @ApiOperation(value = "问候2", notes = "你好2xxx")
    @RequestMapping(value="/greeting2", method = RequestMethod.POST)
    public String greeting2(@RequestParam String name) {
        return "你好2," + name;
    }

    @ApiOperation(value = "日志打印", notes = "日志测试API")
    @RequestMapping(value="/logging", method = RequestMethod.GET)
    public String logging() {
        logger.info("this is logger info");
        logger.warn("this is logger warn");
        logger.error("this is logger error");
        return "logging";
    }
}
