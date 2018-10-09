/**
 * Project Name:fire-industry-map
 * File Name:CompanyServer.java
 * Package Name:com.firestone.web
 * Date:2018年7月10日上午11:37:34
 *
*/

package com.firestone.api;


import com.firestone.model.ServerResult;
import com.firestone.model.vo.BaseVo;
import com.firestone.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 园区企业/医健企业公司模块相关服务接口
 * @author lvxc
 * @date 2018年7月10日 上午11:37:34
 */
@Api(value = "产业总览/园区企业/医健公司模块",tags = {"01.【产业总览/园区企业/医健公司】模块接口"})
@RestController
@RequestMapping("/company")
public class CompanyServer {

    @Autowired
    private CompanyService companyService ;

    
    /**
     * 
     * @Description: 获取企业公司总数
     * @param
     * @return
     * @throws Exception   
     * @author lvxc
     * @date 2018年7月19日 下午2:05:04
     * @lastModifier Administrator
     */
    @ApiOperation(value = "企业/公司总数(验)", notes = "企业/公司总数接口", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping("count")
    public ServerResult<Long> getCompanyCount(@RequestBody BaseVo baseVo) throws Exception{
        Long num = companyService.getCompanyCount(baseVo);
        return ServerResult.success(num);
    }
}

