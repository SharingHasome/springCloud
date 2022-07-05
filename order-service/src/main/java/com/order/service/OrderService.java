package com.order.service;

import com.order.domain.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author dell
* @description 针对表【tb_order】的数据库操作Service
* @createDate 2022-06-24 11:15:49
*/
public interface OrderService extends IService<Order> {

    Order selectById(Long orderId);

}
