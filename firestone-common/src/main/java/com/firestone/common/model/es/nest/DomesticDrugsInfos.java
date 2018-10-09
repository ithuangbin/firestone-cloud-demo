/**
 * Project Name:fire-industry-map
 * File Name:DomesticDrugsInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午9:06:53
 *
*/

package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 获批药品信息部分
 * @author lvxc
 * @date 2018年8月1日 下午9:06:53
 */
@ApiModel
public class DomesticDrugsInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    //获批药品id
    @ApiModelProperty(value = "获批药品id", example = "获批药品id）")
    private String doc_id;
    //批准文号
    @ApiModelProperty(value = "批准文号", example = "批准文号）")
    private String approval_reference_number ;
    //产品名
    @ApiModelProperty(value = "产品名", example = "产品名）")
    private String product_name ;
    //英文名
    @ApiModelProperty(value = "英文名", example = "英文名）")
    private String english_product_name ;
    //商品名
    @ApiModelProperty(value = "商品名", example = "商品名）")
    private String commodity_name ;
    //剂型
    @ApiModelProperty(value = "剂型", example = "剂型）")
    private String dosage_form ;
    //规格
    @ApiModelProperty(value = "规格", example = "规格）")
    private String specifications ;
    //产品类型
    @ApiModelProperty(value = "产品类型", example = "产品类型）")
    private String product_type ;
    //批准日期
    @ApiModelProperty(value = "批准日期", example = "批准日期）")
    private String approval_date ;
    //生产地址
    @ApiModelProperty(value = "生产地址", example = "生产地址）")
    private String manufactor_address ;
    //适应症
    @ApiModelProperty(value = "适应症", example = "适应症）")
    private String indications ;
    //申请类型
    @ApiModelProperty(value = "申请类型", example = "申请类型）")
    private String application_type ;
    //首次获取批年份
    @ApiModelProperty(value = "首次获取批年份", example = "首次获取批年份）")
    private String first_approval_year ;
    //靶点
    @ApiModelProperty(value = "靶点", example = "靶点）")
    private String target ;
    //药品类型
    @ApiModelProperty(value = "药品类型", example = "药品类型）")
    private String drug_types;
    public String getDoc_id() {
        return doc_id;
    }
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
    public String getApproval_reference_number() {
        return approval_reference_number;
    }
    public void setApproval_reference_number(String approval_reference_number) {
        this.approval_reference_number = approval_reference_number;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public String getEnglish_product_name() {
        return english_product_name;
    }
    public void setEnglish_product_name(String english_product_name) {
        this.english_product_name = english_product_name;
    }
    public String getCommodity_name() {
        return commodity_name;
    }
    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }
    public String getDosage_form() {
        return dosage_form;
    }
    public void setDosage_form(String dosage_form) {
        this.dosage_form = dosage_form;
    }
    public String getSpecifications() {
        return specifications;
    }
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }
    public String getProduct_type() {
        return product_type;
    }
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
    public String getApproval_date() {
        return approval_date;
    }
    public void setApproval_date(String approval_date) {
        this.approval_date = approval_date;
    }
    public String getManufactor_address() {
        return manufactor_address;
    }
    public void setManufactor_address(String manufactor_address) {
        this.manufactor_address = manufactor_address;
    }
    public String getIndications() {
        return indications;
    }
    public void setIndications(String indications) {
        this.indications = indications;
    }
    public String getApplication_type() {
        return application_type;
    }
    public void setApplication_type(String application_type) {
        this.application_type = application_type;
    }
    public String getFirst_approval_year() {
        return first_approval_year;
    }
    public void setFirst_approval_year(String first_approval_year) {
        this.first_approval_year = first_approval_year;
    }
    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }
    public String getDrug_types() {
        return drug_types;
    }
    public void setDrug_types(String drug_types) {
        this.drug_types = drug_types;
    }
    
}

