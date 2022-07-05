package com.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feign.clients.UserClient;
import com.feign.pojo.User;
import com.order.domain.Order;
import com.order.service.OrderService;
import com.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
* @author dell
* @description 针对表【tb_order】的数据库操作Service实现
* @createDate 2022-06-24 11:15:49
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{
    @Resource
    private OrderMapper orderMapper;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    UserClient userClient;
    @Override
    public Order selectById(Long orderId) {
        Order order = orderMapper.findById(orderId);
//            User user = restTemplate.getForObject("http://userservice/user/" + order.getUserId(), User.class);
        User user = userClient.findById(order.getUserId());
        order.setUser(user);
            return order;
        }
    }




