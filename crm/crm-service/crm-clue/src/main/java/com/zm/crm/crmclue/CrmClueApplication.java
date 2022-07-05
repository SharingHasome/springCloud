package com.zm.crm.crmclue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class CrmClueApplication {
    /**
    * 注意：使用步骤
    * 启动nacos
    * 启动api-gateway
    * 请在crm-clue-ui目录中运行yarn install安装前端依赖，运行yarn serve启动前端项目
    */
    public static void main(String[] args) {
        SpringApplication.run(CrmClueApplication.class, args);
    }
}

