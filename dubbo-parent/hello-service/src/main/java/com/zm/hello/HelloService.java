package com.zm.hello;

import com.zm.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloService implements IHelloService {
    @Override
    public String hello(String name) {

        return "HELLO"+name;
    }
}
