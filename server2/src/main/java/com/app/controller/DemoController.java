package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.app.controller
 * @ClassName DemoController
 * @Author wangshaobin
 * @Date 2018/9/29 14:11
 * @Version 1.0
 * @Description:
 **/
@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String demo() {
        return "hello word！";
    }
}
