package com.firestone.feign.fallback;

import com.firestone.feign.Companyervice;
import com.firestone.model.BaseVo;
import com.firestone.model.ServerResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: huang
 * @Date: 2018/9/30 15:48
 * @Description:
 */
@Component
public class CompanyHystrix implements Companyervice{

    @Override
    public ServerResult<Long> getCompanyCount(@RequestBody BaseVo vo) {
        return ServerResult.timeout();
    }

    @Override
    public ServerResult<Object> getBasicInfo(@RequestParam("id") String id, @RequestParam("areaId") String areaId) {
        return ServerResult.timeout();
    }
}