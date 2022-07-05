package com.user.controller;

import com.user.config.PatternProperties;
import com.user.service.UserService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
//@RefreshScope //配置热更新
public class UserController {

        @Autowired
        private UserService userService;
        @Autowired
        private PatternProperties patternProperties;
//        @Value("${pattern.dateformat}")
//        private String datefomat;
    @RequestMapping("/user/{userId}")
    public Object userInfo(@PathVariable Long userId){
      return  userService.selectByOrderId(userId);
    }
    @RequestMapping("/now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(patternProperties.getDateformat()));
    }
    @RequestMapping("/prop")
    public PatternProperties prop(){
        return patternProperties;
    }
}
