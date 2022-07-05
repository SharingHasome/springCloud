package com.order.mapper;

import com.order.domain.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
* @author dell
* @description 针对表【tb_order】的数据库操作Mapper
* @createDate 2022-06-24 11:15:49
* @Entity com.order.domain.Order
*/
public interface OrderMapper extends BaseMapper<Order> {
    @Select("select * from tb_order where id = #{id}")
    Order findById(Long orderId);

}




