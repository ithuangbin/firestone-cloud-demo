package com.firestone.feign;

import com.firestone.common.model.ServerResult;
import com.firestone.common.model.vo.BaseParam;
import com.firestone.feign.fallback.CompanyHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Auther: huang
 * @Date: 2018/9/30 10:06
 * @Description:
 */
@FeignClient(name = "company-service",fallback = CompanyHystrix.class,decode404 = true)
public interface Companyervice {

    @PostMapping(value = "company/basic")
    ServerResult<Object> getBasicInfo(@RequestBody BaseParam vo);
}