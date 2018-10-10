package com.firestone.service;


import com.firestone.common.model.RespListDto;
import com.firestone.common.model.es.CydnMapProject;
import com.firestone.common.model.vo.BaseParam;

/**
 * @Auther: huang
 * @Date: 2018/9/29 15:46
 * @Description:
 */
public interface ICompanyService {


    /**
     * 查询企业基本信息
     * @param baseParam
     * @return
     */
    CydnMapProject getCompanyBasicInfo(BaseParam baseParam);

    /**
     * 查询企业详情-制定标准
     * @param baseParam
     * @return
     */
    RespListDto standardInfo( BaseParam baseParam);
}