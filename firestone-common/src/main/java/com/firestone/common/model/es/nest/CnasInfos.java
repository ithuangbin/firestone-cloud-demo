/**
 * Project Name:fire-industry-map
 * File Name:CnasInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午10:09:58
 *
*/

package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: cnas信息部分
 * @author lvxc
 * @date 2018年8月1日 下午10:09:58
 */
@ApiModel
public class CnasInfos implements Serializable{
        
    private static final long serialVersionUID = 1L;
    //cnas id
    @ApiModelProperty(value = "cnas id", example = "cnas id）")
    private String doc_id ;
    //编号
    @ApiModelProperty(value = "编号", example = "编号）")
    private String registration_number ;
    //认可有效期限
    @ApiModelProperty(value = "认可有效期限", example = "认可有效期限）")
    private String valid_period ;
    public String getDoc_id() {
        return doc_id;
    }
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
    public String getRegistration_number() {
        return registration_number;
    }
    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }
    public String getValid_period() {
        return valid_period;
    }
    public void setValid_period(String valid_period) {
        this.valid_period = valid_period;
    }
    
}

