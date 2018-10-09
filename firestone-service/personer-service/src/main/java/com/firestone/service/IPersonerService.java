package com.firestone.service;

import com.firestone.common.model.es.CydnPersonInformationInfos;

/**
 * @Auther: huang
 * @Date: 2018/10/9 20:15
 * @Description:
 */
public interface IPersonerService {

    /**
     * 人才详情
     * @param id
     * @param areaId
     * @return
     */
    CydnPersonInformationInfos findDetail(String id, String areaId);
}