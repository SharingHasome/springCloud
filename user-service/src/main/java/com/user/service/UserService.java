package com.user.service;

import com.user.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author dell
* @description 针对表【tb_user】的数据库操作Service
* @createDate 2022-06-24 11:30:38
*/
public interface UserService extends IService<User> {

    User selectByOrderId(Long orderId);
}
