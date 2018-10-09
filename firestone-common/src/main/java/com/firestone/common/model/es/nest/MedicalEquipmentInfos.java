/**
 * Project Name:fire-industry-map
 * File Name:MedicalEquipmentInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午8:59:07
 *
*/

package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 获批器械
 * @author lvxc
 * @date 2018年8月1日 下午8:59:07
 */
@ApiModel
public class MedicalEquipmentInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    
    //器械id
    @ApiModelProperty(value = "器械id", example = "器械id）")
    private String doc_id ;
    //产品名称
    @ApiModelProperty(value = "产品名称", example = "产品名称）")
    private String production_name_chinese ;
    //注册证编号
    @ApiModelProperty(value = "注册证编号", example = "注册证编号）")
    private String registration_id ;
    //注册人名称
    @ApiModelProperty(value = "注册人名称", example = "注册人名称）")
    private String registration_name;
    //注册人住所
    @ApiModelProperty(value = "注册人住所", example = "注册人住所）")
    private String registration_address ;
    //生产地址
    @ApiModelProperty(value = "生产地址", example = "生产地址）")
    private String production_address ;
    //规格型号
    @ApiModelProperty(value = "规格型号", example = "规格型号）")
    private String type_and_specification;
    //使用范围
    @ApiModelProperty(value = "使用范围", example = "使用范围）")
    private String application ;
    //发证日期
    @ApiModelProperty(value = "发证日期", example = "发证日期")
    private String approval_date ;
    //有效期至
    @ApiModelProperty(value = "有效期至", example = "有效期至）")
    private String expiration ;
    //结果及组成
    @ApiModelProperty(value = "结果及组成", example = "结果及组成）")
    private String structure ;
    public String getDoc_id() {
        return doc_id;
    }
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
    public String getProduction_name_chinese() {
        return production_name_chinese;
    }
    public void setProduction_name_chinese(String production_name_chinese) {
        this.production_name_chinese = production_name_chinese;
    }
    public String getRegistration_id() {
        return registration_id;
    }
    public void setRegistration_id(String registration_id) {
        this.registration_id = registration_id;
    }
    public String getRegistration_name() {
        return registration_name;
    }
    public void setRegistration_name(String registration_name) {
        this.registration_name = registration_name;
    }
    public String getRegistration_address() {
        return registration_address;
    }
    public void setRegistration_address(String registration_address) {
        this.registration_address = registration_address;
    }
    public String getProduction_address() {
        return production_address;
    }
    public void setProduction_address(String production_address) {
        this.production_address = production_address;
    }
    public String getType_and_specification() {
        return type_and_specification;
    }
    public void setType_and_specification(String type_and_specification) {
        this.type_and_specification = type_and_specification;
    }
    public String getApplication() {
        return application;
    }
    public void setApplication(String application) {
        this.application = application;
    }
    public String getApproval_date() {
        return approval_date;
    }
    public void setApproval_date(String approval_date) {
        this.approval_date = approval_date;
    }
    public String getExpiration() {
        return expiration;
    }
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
    public String getStructure() {
        return structure;
    }
    public void setStructure(String structure) {
        this.structure = structure;
    }
    
}

