package com.firestone.feign.fallback;

import com.firestone.common.model.ServerResult;
import com.firestone.common.model.vo.BaseParam;
import com.firestone.feign.Companyervice;
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
    public ServerResult<Object> getBasicInfo(@RequestBody BaseParam vo) {
        return ServerResult.timeout();
    }
}