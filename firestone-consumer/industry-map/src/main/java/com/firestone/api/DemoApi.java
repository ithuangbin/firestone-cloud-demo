package com.firestone.api;

import com.firestone.feign.PersonerService;
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
    PersonerService personerService;

    @Autowired
    Companyervice companyervice;


    @PostMapping("count")
    public ServerResult<Long> count(@RequestBody BaseVo vo){
        return companyervice.getCompanyCount(vo);
    }

    @PostMapping("basic")
    public ServerResult<Object> basic(@RequestBody BaseVo vo){
        return companyervice.getBasicInfo(vo.getId(),vo.getAreaId());
    }

    @PostMapping("person/detail")
    public ServerResult<Object> detail(@RequestBody BaseVo vo){
        return personerService.getPersonDetail(vo.getId(),vo.getAreaId());
    }
}