package com.firestone.feign;

import com.firestone.feign.fallback.IndustryHystrix;
import com.firestone.model.ServerResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: huang
 * @Date: 2018/9/30 10:06
 * @Description:
 */
@FeignClient(name = "industry-service",fallback = IndustryHystrix.class)
public interface ApiService {

    @PostMapping("/sayHello")
    ServerResult<String> sayHello(@RequestParam("str") String str);
}