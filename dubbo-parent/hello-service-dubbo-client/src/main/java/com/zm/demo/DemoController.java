package com.zm.demo;

import com.zm.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

@RestController
public class DemoController {
    /**
     * 服务消费者
     */
    @DubboReference
    private IHelloService helloService;
    @GetMapping
    public String name(String name){
        return helloService.hello(name);
    }
}
