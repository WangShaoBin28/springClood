package com.app.hystrix;

import com.app.feign.DemoFeign;

/**
 * @Package com.app.hystrix
 * @ClassName DemoHystrix
 * @Author wangshaobin
 * @Date 2018/9/29 14:08
 * @Version 1.0
 * @Description:
 **/
public class DemoHystrix implements DemoFeign {

    @Override
    public String demo() {
        return "不行错了";
    }
}
