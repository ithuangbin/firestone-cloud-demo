package com.firestone.feign.fallback;

import com.firestone.feign.ApiService;
import com.firestone.model.ServerResult;
import org.springframework.stereotype.Component;

/**
 * @Auther: huang
 * @Date: 2018/9/30 15:48
 * @Description:
 */
@Component
public class IndustryHystrix implements ApiService{
    @Override
    public ServerResult<String> sayHello(String str) {
        return ServerResult.timeout();
    }
}