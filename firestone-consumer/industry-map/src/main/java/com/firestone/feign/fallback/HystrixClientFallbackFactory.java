package com.firestone.feign.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Auther: huang
 * @Date: 2018/10/8 16:16
 * @Description:
 */
@Component
public class HystrixClientFallbackFactory<T> implements FallbackFactory<T> {

    @Override
    public T create(Throwable throwable) {
        return null;
    }
}