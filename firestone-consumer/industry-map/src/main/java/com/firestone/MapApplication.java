package com.firestone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: huang
 * @Date: 2018/9/29 15:17
 * @Description:
 */
@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
@Configuration
public class MapApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapApplication.class, args);
    }

}