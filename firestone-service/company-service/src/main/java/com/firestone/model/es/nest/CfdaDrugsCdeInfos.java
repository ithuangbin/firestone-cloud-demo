/**
 * Project Name:fire-industry-map
 * File Name:CfdaDrugsCdeInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午11:08:12
 *
*/

package com.firestone.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 药品受理状态信息
 * @author lvxc
 * @date 2018年8月1日 下午11:08:12
 */
@ApiModel
public class CfdaDrugsCdeInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String doc_id ;
    
    //药品名称
    @ApiModelProperty(value = "药品受理状态-药品名", example = "药品受理状态-药品名")
    private String drug_name ;
    //受理号
    @ApiModelProperty(value = "药品受理状态-受理号", example = "药品受理状态-受理号")
    private String acceptance_id ;
    //受理类型
    @ApiModelProperty(value = "药品受理状态-受理类型", example = "药品受理状态-受理类型")
    private String application_type ;
    //最新进度
    @ApiModelProperty(value = "药品受理状态-最新进度", example = "药品受理状态-最新进度")
    private String recevied_state ;
    //进度更新日期
    @ApiModelProperty(value = "药品受理状态-进度更新日期", example = "药品受理状态-进度更新日期")
    private String apply_start_date;
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
    public String getAcceptance_id() {
        return acceptance_id;
    }
    public void setAcceptance_id(String acceptance_id) {
        this.acceptance_id = acceptance_id;
    }
    public String getApplication_type() {
        return application_type;
    }
    public void setApplication_type(String application_type) {
        this.application_type = application_type;
    }
    public String getRecevied_state() {
        return recevied_state;
    }
    public void setRecevied_state(String recevied_state) {
        this.recevied_state = recevied_state;
    }
    public String getApply_start_date() {
        return apply_start_date;
    }
    public void setApply_start_date(String apply_start_date) {
        this.apply_start_date = apply_start_date;
    }
    

}

