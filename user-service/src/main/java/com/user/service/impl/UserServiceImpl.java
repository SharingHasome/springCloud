package com.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.user.domain.User;
import com.user.service.UserService;
import com.user.mapper.UserMapper;
import com.user.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author dell
* @description 针对表【tb_user】的数据库操作Service实现
* @createDate 2022-06-24 11:30:38
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    @Override
    public User selectByOrderId(Long userId) {
        return baseMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getId, userId));
    }
}




