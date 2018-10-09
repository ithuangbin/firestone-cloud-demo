package com.firestone.feign;

import com.firestone.feign.fallback.PersonHystrix;
import com.firestone.model.ServerResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: huang
 * @Date: 2018/9/30 10:06
 * @Description:
 */
@FeignClient(name = "personer-service",fallback = PersonHystrix.class)
public interface PersonerService {

    @PostMapping(value = "person/detail")
    ServerResult<Object> getPersonDetail(@RequestParam("str") String id, @RequestParam("areaId") String areaId);
}