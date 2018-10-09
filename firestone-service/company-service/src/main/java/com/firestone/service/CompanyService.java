package com.firestone.service;

import com.firestone.model.es.CydnMapProject;
import com.firestone.model.vo.BaseVo;

/**
 * @Auther: huang
 * @Date: 2018/9/29 15:46
 * @Description:
 */
public interface CompanyService {
    Long getCompanyCount(BaseVo baseVo);

    /**
     * 查询企业基本信息
     * @param id
     * @param areaId
     * @return
     */
    CydnMapProject getCompanyBasicInfo(String id, String areaId);
}