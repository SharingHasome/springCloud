package com.zm.crm.crmcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CrmCourseApplication {
    /**
    * 注意：使用步骤
    * 启动nacos
    * 启动api-gateway
    * 请在crm-course-ui目录中运行yarn install安装前端依赖，运行yarn serve启动前端项目
    */
    public static void main(String[] args) {
        SpringApplication.run(CrmCourseApplication.class, args);
    }
}

