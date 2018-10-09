package com.firestone.api;

import com.firestone.feign.ApiService;
import com.firestone.feign.Companyervice;
import com.firestone.model.BaseVo;
import com.firestone.model.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: huang
 * @Date: 2018/9/30 09:39
 * @Description:
 */
@RestController
public class DemoApi {

    @Autowired
    ApiService apiService;

    @Autowired
    Companyervice companyervice;

    @GetMapping("sayHello/{str}")
    public ServerResult<String> sayHello(@PathVariable(value = "str",required = false)String str){
        return apiService.sayHello(str);
    }

    @PostMapping("count")
    public ServerResult<Long> count(@RequestBody BaseVo vo){
        return companyervice.getCompanyCount(vo);
    }

    @PostMapping("basic")
    public ServerResult<Object> basic(@RequestBody BaseVo vo){
        return companyervice.getBasicInfo(vo.getId(),vo.getAreaId());
    }
}