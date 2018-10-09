package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModelProperty;

/**
* @Description: (人物合作关系)
* @param
* @return
* @author wuzy
* @date 2018/8/16/016 0:00
*/
public class CooperativeInstitution {

    /**
    * @Fields  :count (合作机构数量)
    */
    @ApiModelProperty(value = "合作机构数量", notes = "合作机构数量", example = "合作机构数量")
    private String count;

    /**
    * @Fields  :name (机构名称)
    */
    @ApiModelProperty(value = "机构名称", notes = "机构名称", example = "机构名称")
    private String name;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
