package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModelProperty;

/**
* @Description: (人才分布嵌套)
* @param
* @return
* @author wuzy
* @date 2018/9/20/020 21:19
*/
public class InsideParkList {
    /**
    * @Fields  :area (地区)
    */
    @ApiModelProperty(value = "地区", notes = "地区", example = "地区")
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
