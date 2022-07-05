package com.epr.auth.controller;

import com.epr.auth.domain.User;
import com.epr.auth.service.SysLoginService;
import com.epr.domain.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class TokenController {
    @Resource
    private SysLoginService sysLoginService;
    @PostMapping("login")
    public R<?> login(@RequestBody User form)
    {
        // 用户登录
        LoginUser userInfo = sysLoginService.login(form.getUsername(), form.getPassword());
        // 获取登录token
        return R.ok(tokenService.createToken(userInfo));
    }
}
