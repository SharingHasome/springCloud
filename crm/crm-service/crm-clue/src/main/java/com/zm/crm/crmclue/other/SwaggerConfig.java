package com.zm.crm.crmclue.other;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Value("${spring.application.name}")
    private String projectName;
    @Value("${swagger.enabled:false}")
    private Boolean enabled;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zm.crm.crmclue.controller"))
                .paths(PathSelectors.any())
                .build()
                .enable(enabled);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(projectName + ":Swagger3接口文档")
                .description("更多请咨询服务开发者ttxs.com")
                .contact(new Contact("john.yi@qq.com", "http://www.yy-accp.com", "john.yi@qq.com"))
                .version("1.0")
                .build();
    }
}
