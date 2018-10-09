package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class StandardInfos implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(example = "源文档id")
    private String doc_id;

    @ApiModelProperty(example = "标准状态")
    private String standard_state;

    @ApiModelProperty(example = "实施日期")
    private String execute_date;

    @ApiModelProperty(example = "标准类型")
    private String type;

    @ApiModelProperty(example = "中国标准分类号")
    private String ccs;

    @ApiModelProperty(example = "标准号")
    private String standard_num;

    @ApiModelProperty(example = "国际标准分类号")
    private String ics;

    @ApiModelProperty(example = "归口单位")
    private String technical_committees;

    @ApiModelProperty(example = "首次发布日期")
    private String first_issuance_date;

    @ApiModelProperty(example = "中文标准名称")
    private String standard_title_cn;

    @ApiModelProperty(example = "主管部门")
    private String governor;

    @ApiModelProperty(example = "起草单位")
    private String drafting_committees;

    @ApiModelProperty(example = "标准性质")
    private String standard_nature;

    @ApiModelProperty(example = "发布日期")
    private String issuance_date;

    @ApiModelProperty(example = "版本")
    private String edition;

    @ApiModelProperty(example = "行业分类")
    private String industry_type;

    @ApiModelProperty(example = "备案号")
    private String record_num;

    @ApiModelProperty(example = "标准类别")
    private String standard_sort;

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getStandard_state() {
        return standard_state;
    }

    public void setStandard_state(String standard_state) {
        this.standard_state = standard_state;
    }

    public String getExecute_date() {
        return execute_date;
    }

    public void setExecute_date(String execute_date) {
        this.execute_date = execute_date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCcs() {
        return ccs;
    }

    public void setCcs(String ccs) {
        this.ccs = ccs;
    }

    public String getStandard_num() {
        return standard_num;
    }

    public void setStandard_num(String standard_num) {
        this.standard_num = standard_num;
    }

    public String getIcs() {
        return ics;
    }

    public void setIcs(String ics) {
        this.ics = ics;
    }

    public String getTechnical_committees() {
        return technical_committees;
    }

    public void setTechnical_committees(String technical_committees) {
        this.technical_committees = technical_committees;
    }

    public String getFirst_issuance_date() {
        return first_issuance_date;
    }

    public void setFirst_issuance_date(String first_issuance_date) {
        this.first_issuance_date = first_issuance_date;
    }

    public String getStandard_title_cn() {
        return standard_title_cn;
    }

    public void setStandard_title_cn(String standard_title_cn) {
        this.standard_title_cn = standard_title_cn;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        this.governor = governor;
    }

    public String getDrafting_committees() {
        return drafting_committees;
    }

    public void setDrafting_committees(String drafting_committees) {
        this.drafting_committees = drafting_committees;
    }

    public String getStandard_nature() {
        return standard_nature;
    }

    public void setStandard_nature(String standard_nature) {
        this.standard_nature = standard_nature;
    }

    public String getIssuance_date() {
        return issuance_date;
    }

    public void setIssuance_date(String issuance_date) {
        this.issuance_date = issuance_date;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getIndustry_type() {
        return industry_type;
    }

    public void setIndustry_type(String industry_type) {
        this.industry_type = industry_type;
    }

    public String getRecord_num() {
        return record_num;
    }

    public void setRecord_num(String record_num) {
        this.record_num = record_num;
    }

    public String getStandard_sort() {
        return standard_sort;
    }

    public void setStandard_sort(String standard_sort) {
        this.standard_sort = standard_sort;
    }
}
