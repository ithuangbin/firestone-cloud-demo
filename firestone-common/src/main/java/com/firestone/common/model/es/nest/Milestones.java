/**
 * Project Name:fire-industry-map
 * File Name:Milestones.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午5:45:58
 *
*/

package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 变更信息/里程碑
 * @author lvxc
 * @date 2018年8月1日 下午5:45:58
 */
public class Milestones implements Serializable{

    private static final long serialVersionUID = 1L;
    //变更前
    @ApiModelProperty(value = "变更前", example = "变更前）")
    private String describle_1 ;
    //变更后
    @ApiModelProperty(value = "变更后", example = "变更后）")
    private String describle_2 ;
    //变更时间
    @ApiModelProperty(value = "变更时间", example = "变更时间）")
    private String time ;
    //变更项目
    @ApiModelProperty(value = "变更项目", example = "变更项目）")
    private String title ;
    public String getDescrible_1() {
        return describle_1;
    }
    public void setDescrible_1(String describle_1) {
        this.describle_1 = describle_1;
    }
    public String getDescrible_2() {
        return describle_2;
    }
    public void setDescrible_2(String describle_2) {
        this.describle_2 = describle_2;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
}

