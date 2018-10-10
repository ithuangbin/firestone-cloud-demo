package com.firestone.service;


import com.firestone.common.model.RespListDto;
import com.firestone.common.model.es.CydnMapProject;
import com.firestone.common.model.vo.BaseParam;
import com.firestone.common.model.vo.CompanySearchVo;

/**
 * @Auther: huang
 * @Date: 2018/9/29 15:46
 * @Description:
 */
public interface ICompanyService {


    /**
     * 查询企业详情
     * @param baseParam
     * @return
     */
    CydnMapProject getCompanyBasicInfo(BaseParam baseParam);

    /**
     * 查询企业详情-制定标准
     * @param searchVo
     * @return
     */
    RespListDto standardInfo( CompanySearchVo searchVo);

    /**
     * 查询企业详情-知识产权-专利
     * @param searchVo
     * @return
     */
    RespListDto patentInfo(CompanySearchVo searchVo);

    /**
     * 查询企业详情-知识产权-文献
     * @param searchVo
     * @return
     */
    RespListDto literatureInfo(CompanySearchVo searchVo);

    /**
     * 查询企业详情-知识产权-商标
     * @param searchVo
     * @return
     */
    RespListDto brandInfo(CompanySearchVo searchVo);

    /**
     * 查询企业详情-舆情动态
     * @param searchVo
     * @return
     */
    RespListDto newsInfo(CompanySearchVo searchVo);

    /**
     * 查询企业详情-高端人才
     * @param searchVo
     * @return
     */
    RespListDto talentInfo(CompanySearchVo searchVo);

    /**
     * 查询企业详情-参与项目
     * @param searchVo
     * @return
     */
    RespListDto projectInfo(CompanySearchVo searchVo);

    /**
     * 查询企业详情-获奖情况
     * @param searchVo
     * @return
     */
    RespListDto awardInfo(CompanySearchVo searchVo);
}