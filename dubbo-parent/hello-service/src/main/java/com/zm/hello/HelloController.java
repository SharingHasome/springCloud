package com.zm.hello;

import com.zm.IHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
//    @Resource
//    private IHelloService iHelloService;
    @RequestMapping
    public String hello(String name){
      return  "hello"+ name.toLowerCase();
    }
}
