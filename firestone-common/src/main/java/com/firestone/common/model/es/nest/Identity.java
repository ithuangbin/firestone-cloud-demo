/**
 * Project Name:fire-industry-map
 * File Name:Founder.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午5:38:40
 *
*/

package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 身份信息
 * @author lvxc
 * @date 2018年8月1日 下午5:38:40
 */
public class Identity implements Serializable{
    private static final long serialVersionUID = 1L;
    //名称
    @ApiModelProperty(value = "名称", example = "名称）")
    private String name ;
    //职务
    @ApiModelProperty(value = "职务", example = "职务）")
    private String zhiwu ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getZhiwu() {
        return zhiwu;
    }
    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu;
    }
    
    
    
}

