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
import com.firestone.common.model.vo.CompanySearchVo;
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
     * 企业详情
     * @param baseParam
     * @return
     * @throws Exception
     */
    @PostMapping("basic")
    public ServerResult<Object> basicInfo(@RequestBody BaseParam baseParam) throws Exception{
        CydnMapProject project = companyService.getCompanyBasicInfo(baseParam);
        return ServerResult.success(project);
    }

    /**
     * 企业详情-制定标准
     * @param searchVo
     * @return
     * @throws Exception
     */
    @PostMapping(value="standardInfo")
    public ServerResult<Object> standardInfo(@RequestBody CompanySearchVo searchVo) throws Exception{
        RespListDto resp = companyService.standardInfo(searchVo);
        return ServerResult.success(resp);
    }

    /**
     * 企业详情-知识产权-专利
     * @param searchVo
     * @return
     * @throws Exception
     */
    @RequestMapping(value="patentInfo")
    public ServerResult<Object> patentInfo(@RequestBody CompanySearchVo searchVo) throws Exception{
        RespListDto resp = companyService.patentInfo(searchVo);
        return ServerResult.success(resp);
    }

    /**
     * 企业详情-知识产权-文献
     * @param searchVo
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/literatureInfo")
    public ServerResult<Object> literatureInfo(@RequestBody CompanySearchVo searchVo) throws Exception{
        RespListDto resp = companyService.literatureInfo(searchVo);
        return ServerResult.success(resp);
    }

    /**
     * 企业详情-知识产权-商标
     * @param searchVo
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/brandInfo")
    public ServerResult<Object> brandInfo(@RequestBody CompanySearchVo searchVo) throws Exception{
        RespListDto resp = companyService.brandInfo(searchVo);
        return ServerResult.success(resp);
    }

    /**
     * 企业详情-舆情动态
     * @param searchVo
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/newsInfo")
    public ServerResult<Object> newsInfo(@RequestBody CompanySearchVo searchVo) throws Exception{
        RespListDto resp = companyService.newsInfo(searchVo);
        return ServerResult.success(resp);
    }

    /**
     * 企业详情-高端人才
     * @param searchVo
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/talentInfo")
    public ServerResult<Object> talentInfo(@RequestBody CompanySearchVo searchVo) throws Exception{
        RespListDto resp = companyService.talentInfo(searchVo);
        return ServerResult.success(resp);
    }

    /**
     * 企业详情-参与项目
     * @param searchVo
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/projectInfo")
    public ServerResult<Object> projectInfo(@RequestBody CompanySearchVo searchVo) throws Exception{
        RespListDto resp = companyService.projectInfo(searchVo);
        return ServerResult.success(resp);
    }

    /**
     * 企业详情-获奖情况
     * @param searchVo
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/awardInfo")
    public ServerResult<Object> awardInfo(@RequestBody CompanySearchVo searchVo) throws Exception{
        RespListDto resp = companyService.awardInfo(searchVo);
        return ServerResult.success(resp);
    }
}

