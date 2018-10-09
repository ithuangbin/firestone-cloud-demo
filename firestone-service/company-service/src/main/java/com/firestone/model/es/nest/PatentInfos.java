/**
 * Project Name:fire-industry-map
 * File Name:PatentInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午8:49:22
 *
*/

package com.firestone.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 专利信息
 * @author lvxc
 * @date 2018年8月1日 下午8:49:22
 */
@ApiModel
public class PatentInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(example = "专利id")
    private String doc_id ;

    @ApiModelProperty(example = "专利名称")
    private String title ;

    @ApiModelProperty(example = "公开号")
    private String publication_num ;

    @ApiModelProperty(example = "公开日")
    private String publication_date ;

    @ApiModelProperty(example = "申请号")
    private String application_num ;

    @ApiModelProperty(example = "申请日")
    private String application_date ;

    @ApiModelProperty(example = "ipc分类号")
    private String ipc_classification_number ;

    @ApiModelProperty(example = "摘要")
    private String summary ;

    @ApiModelProperty(example = "期限届满期")
    private String exp_time;

    @ApiModelProperty(example = "专利类型")
    private String shengingleixing;

    @ApiModelProperty(example = "专利状态")
    private String patent_status;

    @ApiModelProperty(example = "当前专利申请人")
    private String applicant_now;

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublication_num() {
        return publication_num;
    }

    public void setPublication_num(String publication_num) {
        this.publication_num = publication_num;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }

    public String getApplication_num() {
        return application_num;
    }

    public void setApplication_num(String application_num) {
        this.application_num = application_num;
    }

    public String getApplication_date() {
        return application_date;
    }

    public void setApplication_date(String application_date) {
        this.application_date = application_date;
    }

    public String getIpc_classification_number() {
        return ipc_classification_number;
    }

    public void setIpc_classification_number(String ipc_classification_number) {
        this.ipc_classification_number = ipc_classification_number;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getExp_time() {
        return exp_time;
    }

    public void setExp_time(String exp_time) {
        this.exp_time = exp_time;
    }

    public String getShengingleixing() {
        return shengingleixing;
    }

    public void setShengingleixing(String shengingleixing) {
        this.shengingleixing = shengingleixing;
    }

    public String getPatent_status() {
        return patent_status;
    }

    public void setPatent_status(String patent_status) {
        this.patent_status = patent_status;
    }

    public String getApplicant_now() {
        return applicant_now;
    }

    public void setApplicant_now(String applicant_now) {
        this.applicant_now = applicant_now;
    }
}

