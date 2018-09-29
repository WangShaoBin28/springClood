package com.app.controller;

import com.app.feign.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.app.controller
 * @ClassName TestController
 * @Author wangshaobin
 * @Date 2018/9/29 14:10
 * @Version 1.0
 * @Description:
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DemoFeign demoFeign;

    @RequestMapping("/demo")
    public String demo() {
        return demoFeign.demo();
    }
}
