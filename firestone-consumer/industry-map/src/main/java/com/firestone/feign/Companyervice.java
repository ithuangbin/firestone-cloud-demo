package com.firestone.feign;

import com.firestone.feign.fallback.CompanyHystrix;
import com.firestone.model.BaseVo;
import com.firestone.model.ServerResult;
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

    @PostMapping(value = "company/count")
    ServerResult<Long> getCompanyCount(@RequestBody BaseVo vo);
}