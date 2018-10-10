/**
 * Project Name:fire-industry-map
 * File Name:CompanyServer.java
 * Package Name:com.firestone.web
 * Date:2018年7月10日上午11:37:34
 *
*/

package com.firestone.api;


import com.firestone.common.model.RespListDto;
import com.firestone.common.model.ServerResult;
import com.firestone.common.model.es.CydnMapProject;
import com.firestone.common.model.vo.BaseParam;
import com.firestone.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 园区企业/医健企业公司模块相关服务接口
 * @author lvxc
 * @date 2018年7月10日 上午11:37:34
 */
@RestController
@RequestMapping("/company")
public class CompanyApi {

    @Autowired
    private ICompanyService companyService ;


    /**
     * 基本企业信息
     * @param baseParam
     * @return
     * @throws Exception
     */
    @PostMapping("basic")
    public ServerResult<Object> getCompanyBasicInfo(@RequestBody BaseParam baseParam) throws Exception{
        CydnMapProject project = companyService.getCompanyBasicInfo(baseParam);
        return ServerResult.success(project);
    }

    /**
     * 企业详情-制定标准
     * @param baseParam
     * @return
     * @throws Exception
     */
    @PostMapping(value="standardInfo")
    public ServerResult<Object>  standardInfo(@RequestBody BaseParam baseParam) throws Exception{
        RespListDto resp = companyService.standardInfo(baseParam);
        return ServerResult.success(resp);
    }
}

