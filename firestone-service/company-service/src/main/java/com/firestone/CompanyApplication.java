package com.firestone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: huang
 * @Date: 2018/9/29 15:17
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@Configurable
@EnableAutoConfiguration
public class CompanyApplication {

    private static final Logger loggger = LogManager.getLogger(CompanyApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
        loggger.info("启动成功！");
    }

}