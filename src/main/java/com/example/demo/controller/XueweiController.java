package com.example.demo.controller;

import com.example.demo.service.dxzy.DxzyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaochao on 2018/12/20 下午5:27
 */
@RestController
public class XueweiController {
    @Autowired
    DxzyService dxzyService;

    @ApiOperation(value = "获取穴位", notes = "根据名称获取")
    @RequestMapping(value = "xuewei", method = RequestMethod.GET)
    public Object getXuewei(@RequestParam String name) {
        return dxzyService.getXuewei(name);
    }

    @ApiOperation(value = "获取穴位", notes = "根据名称获取")
    @RequestMapping(value = "xuewei2", method = RequestMethod.GET)
    public Object getXueweiWithName(@RequestParam String name) {
        return dxzyService.getXueweiWithName(name);
    }
}
