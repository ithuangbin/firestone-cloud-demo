package com.firestone.api;

import com.firestone.common.model.ServerResult;
import com.firestone.common.model.vo.BaseParam;
import com.firestone.feign.Companyervice;
import com.firestone.feign.PersonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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


    @PostMapping("basic")
    public ServerResult<Object> basic(@RequestBody BaseParam vo){
        return companyervice.getBasicInfo(vo);
    }

    @PostMapping("person/detail")
    public ServerResult<Object> detail(@RequestBody BaseParam vo){
        return personerService.getPersonDetail(vo.getId(),vo.getAreaId());
    }
}