/**
 * Project Name:fire-industry-map
 * File Name:BrandInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午9:34:21
 *
*/

package com.firestone.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 公司商标信息
 * @author lvxc
 * @date 2018年8月1日 下午9:34:21
 */
@ApiModel
public class BrandInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    //商标id
    @ApiModelProperty(value = "商标id", example = "商标id）")
    private String doc_id ;
    //商标图片
    @ApiModelProperty(value = "商标图片", example = "商标图片）")
    private String iconurl ;
    //商标名称
    @ApiModelProperty(value = "商标名称", example = "商标名称）")
    private String name ;
    //注册号
    @ApiModelProperty(value = "注册号", example = "注册号）")
    private String reg_num ;
    //申请时间
    @ApiModelProperty(value = "申请时间", example = "申请时间）")
    private String reg_date ;
    public String getDoc_id() {
        return doc_id;
    }
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
    public String getIconurl() {
        return iconurl;
    }
    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getReg_num() {
        return reg_num;
    }
    public void setReg_num(String reg_num) {
        this.reg_num = reg_num;
    }
    public String getReg_date() {
        return reg_date;
    }
    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }
    
}

