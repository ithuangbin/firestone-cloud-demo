package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
* @Description: (公司详情表承担课题)
* @param
* @return
* @author wuzy
* @date 2018/9/5/005 9:36
*/
public class ProjectTableInfo implements Serializable {

    private static final long serialVersionUID = 3648939249961236836L;
    
    /**
    * @Fields  :doc_id (源文档id)
    */
    @ApiModelProperty(value = "源文档id", notes = "源文档id", example = "源文档id")
    private String doc_id;
    
   /**
   * @Fields  :project_name (项目名称)
   */
   @ApiModelProperty(value = "项目名称", notes = "项目名称", example = "项目名称")
   private String project_name;
   
   /**
   * @Fields  :principal (负责人)
   */
   @ApiModelProperty(value = "负责人", notes = "负责人", example = "负责人")
   private String principal;
   
   /**
   * @Fields  :address_province (省份)
   */
   @ApiModelProperty(value = "省份", notes = "省份", example = "省份")
   private String address_province;
   
   /**
   * @Fields  :project_id (项目编号)
   */
   @ApiModelProperty(value = "项目编号", notes = "项目编号", example = "项目编号")
   private String project_id;
   
   /**
   * @Fields  :approval_time (批准时间)
   */
   @ApiModelProperty(value = "批准时间", notes = "批准时间", example = "批准时间")
   private String approval_time;
   
   /**
   * @Fields  :rank (级别)
   */
   @ApiModelProperty(value = "级别", notes = "级别", example = "级别")
   private String rank;
   
   /**
   * @Fields  :item (项目类型)
   */
   @ApiModelProperty(value = "项目类型", notes = "项目类型", example = "项目类型")
   private String item;
   
   /**
   * @Fields  :total_funding (项目总经费（万）)
   */
   @ApiModelProperty(value = "项目总经费（万）", notes = "项目总经费（万）", example = "项目总经费（万）")
   private String total_funding;
   
   /**
   * @Fields  :competent_department (主管部门)
   */
   @ApiModelProperty(value = "主管部门", notes = "主管部门", example = "主管部门")
   private String competent_department;
   
   /**
   * @Fields  :document_number (下达文号)
   */
   @ApiModelProperty(value = "下达文号", notes = "下达文号", example = "下达文号")
   private String document_number;

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getAddress_province() {
        return address_province;
    }

    public void setAddress_province(String address_province) {
        this.address_province = address_province;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getApproval_time() {
        return approval_time;
    }

    public void setApproval_time(String approval_time) {
        this.approval_time = approval_time;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getTotal_funding() {
        return total_funding;
    }

    public void setTotal_funding(String total_funding) {
        this.total_funding = total_funding;
    }

    public String getCompetent_department() {
        return competent_department;
    }

    public void setCompetent_department(String competent_department) {
        this.competent_department = competent_department;
    }

    public String getDocument_number() {
        return document_number;
    }

    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }
}
