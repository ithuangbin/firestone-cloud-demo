/**
 * Project Name:fire-industry-map
 * File Name:CfdaClinicalDrugInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午10:42:57
 *
*/

package com.firestone.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 药品临床信息
 * @author lvxc
 * @date 2018年8月1日 下午10:42:57
 */
@ApiModel
public class CfdaClinicalDrugInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String doc_id ;
    //药品名称
    @ApiModelProperty(value = "药品名称", example = "药品名称）")
    private String drug_name ;
    //登记号
    @ApiModelProperty(value = "登记号", example = "登记号）")
    private String registration_number ;
    //临床阶段
    @ApiModelProperty(value = "临床阶段", example = "临床阶段）")
    private String stage ;
    //首次公示日期
    @ApiModelProperty(value = "首次公示日期", example = "首次公示日期）")
    private String publication_date ;
    public String getDoc_id() {
        return doc_id;
    }
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
    public String getDrug_name() {
        return drug_name;
    }
    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }
    public String getRegistration_number() {
        return registration_number;
    }
    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }
    public String getStage() {
        return stage;
    }
    public void setStage(String stage) {
        this.stage = stage;
    }
    public String getPublication_date() {
        return publication_date;
    }
    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }
    
}

