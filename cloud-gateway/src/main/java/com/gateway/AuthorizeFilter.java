package com.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
@Order(-1)
@Component
public class AuthorizeFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("exchange = " + exchange);
        //1.获取请求参数
        MultiValueMap<String, String> queryParams = exchange.getRequest().getQueryParams();
        //2.获取authorization参数
        String auth = queryParams.getFirst("authorization");
        //3.校验
        if("admin".equals(auth)){
            System.out.println("chain.filter(exchange) = " + chain.filter(exchange));
            return chain.filter(exchange);
        }
        //4 拦截
        //4.1 禁止访问
        exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);
        return exchange.getResponse().setComplete();
    }
}
