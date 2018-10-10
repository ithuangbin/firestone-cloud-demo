package com.firestone.api;

import com.firestone.common.model.ServerResult;
import com.firestone.common.model.vo.BaseParam;
import com.firestone.common.model.vo.CompanySearchVo;
import com.firestone.feign.Companyervice;
import com.firestone.feign.PersonerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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


    @ApiOperation(value = "企业详情", notes = "企业详情接口", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping("basic")
    public ServerResult<Object> basic(@RequestBody BaseParam vo){
        return companyervice.getBasicInfo(vo);
    }

    @ApiOperation(value = "企业详情-制定标准", notes = "企业详情-制定标准接口", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping("standardInfo")
    public ServerResult<Object> standardInfo(@RequestBody CompanySearchVo vo){
        return companyervice.getStandardInfo(vo);
    }

    @ApiOperation(value = "企业详情-知识产权-专利", notes = "企业详情-知识产权-专利接口", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping("patentInfo")
    public ServerResult<Object> patentInfo(@RequestBody CompanySearchVo vo){
        return companyervice.patentInfo(vo);
    }

    @ApiOperation(value = "企业详情-知识产权-文献", notes = "企业详情-知识产权-文献接口", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping("literatureInfo")
    public ServerResult<Object> literatureInfo(@RequestBody CompanySearchVo vo){
        return companyervice.literatureInfo(vo);
    }

    @ApiOperation(value = "企业详情-舆情动态", notes = "企业详情-舆情动态接口", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping("newsInfo")
    public ServerResult<Object> newsInfo(@RequestBody CompanySearchVo vo){
        return companyervice.newsInfo(vo);
    }

    @ApiOperation(value = "人才详情", notes = "人才详情接口", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping("person/detail")
    public ServerResult<Object> detail(@RequestBody BaseParam vo){
        return personerService.getPersonDetail(vo.getId(),vo.getAreaId());
    }
}