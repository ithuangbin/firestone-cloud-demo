/**
 * Project Name:fire-industry-map
 * File Name:SwaggerConfig.java
 * Package Name:com.firestone.config.swagger
 * Date:2018年7月10日上午9:21:52
 *
*/

package com.firestone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: swagger配置
 * @author lvxc
 * @date 2018年7月10日 上午9:21:52
 */
@Configuration
@EnableSwagger2
@Profile({"dev","test"})
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.firestone.api"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(parameter());
    }

    //为所有的Swagger配置token
    private List<Parameter> parameter() {
        List<Parameter> params = new ArrayList<>();
//        params.add(new ParameterBuilder().name("token").description("用户token")
//                .modelRef(new ModelRef("string")).parameterType("header")
//                .required(false).build());
//        params.add(new ParameterBuilder().name("areaId").description("地图id")
//                .modelRef(new ModelRef("string")).parameterType("header")
//                .required(false).build());
        return params;

    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("产业服务api文档")
                .description("产业服务api接口文档")
                .termsOfServiceUrl("http://www.hsmap.com")
                .version("1.0")
                .build();
    }
}

