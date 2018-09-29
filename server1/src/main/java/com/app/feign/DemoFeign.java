package com.app.feign;

import com.app.hystrix.DemoHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package com.app.feign
 * @ClassName DemoFeign
 * @Author wangshaobin
 * @Date 2018/9/29 14:07
 * @Version 1.0
 * @Description:
 **/
@FeignClient(value = "server2", fallback = DemoHystrix.class)
@Component
public interface DemoFeign {

    @RequestMapping("/demo")
    public String demo();
}
