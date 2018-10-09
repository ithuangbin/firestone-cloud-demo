package com.firestone.feign.fallback;

import com.firestone.feign.Companyervice;
import com.firestone.model.BaseVo;
import com.firestone.model.ServerResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

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
}