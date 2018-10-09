package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModelProperty;

/**
* @Description: (人物关系)
* @param
* @return
* @author wuzy
* @date 2018/8/15/015 23:56
*/
public class Relation {

    /**
    * @Fields  :name (姓名)
    */
    @ApiModelProperty(value = "姓名", notes = "姓名", example = "姓名")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
