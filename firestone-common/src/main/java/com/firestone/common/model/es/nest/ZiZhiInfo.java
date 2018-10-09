package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModelProperty;

/**
* @Description: (公司详情公司资质)
* @param
* @return
* @author wuzy
* @date 2018/9/4/004 15:02
*/
public class ZiZhiInfo {
    
    /**
    * @Fields  :zizhi_name (资质名称)
    */
    @ApiModelProperty(value = "资质名称", notes = "资质名称", example = "资质名称")
    private String zizhi_name;

    public String getZizhi_name() {
        return zizhi_name;
    }

    public void setZizhi_name(String zizhi_name) {
        this.zizhi_name = zizhi_name;
    }
}
