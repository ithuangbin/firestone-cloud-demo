package com.firestone.feign.fallback;

import com.firestone.feign.PersonerService;
import com.firestone.model.ServerResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: huang
 * @Date: 2018/9/30 15:48
 * @Description:
 */
@Component
public class PersonHystrix implements PersonerService {

    @Override
    public ServerResult<Object> getPersonDetail(@RequestParam("str") String id, @RequestParam("areaId") String areaId) {
        return ServerResult.timeout();
    }
}