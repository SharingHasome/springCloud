package com.order.controller;

import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
public class OrderController {
    @Autowired
   private OrderService orderService;
    @RequestMapping("/order/{orderId}")
    public Object orderInfo(@PathVariable Long orderId){
        return  orderService.selectById(orderId);
    }
}
