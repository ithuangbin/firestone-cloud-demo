/**
 * Project Name:fire-industry-map
 * File Name:GspInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午9:44:27
 *
*/

package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: GSP 信息部分
 * @author lvxc
 * @date 2018年8月1日 下午9:44:27
 */
@ApiModel
public class GspInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    //gsp id
    @ApiModelProperty(value = "gsp id", example = "gsp id")
    private String doc_id ;
    //证书编号
    @ApiModelProperty(value = "证书编号", example = "证书编号）")
    private String certificate_number ;
    //认证范围
    @ApiModelProperty(value = "认证范围", example = "认证范围）")
    private String business_scope ;
    //发证机关
    @ApiModelProperty(value = "发证机关", example = "发证机关）")
    private String issuing_agence ;
    //发证日期
    @ApiModelProperty(value = "发证日期", example = "发证日期）")
    private String GMP_GSP_issuing_date ;
    public String getDoc_id() {
        return doc_id;
    }
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
    public String getCertificate_number() {
        return certificate_number;
    }
    public void setCertificate_number(String certificate_number) {
        this.certificate_number = certificate_number;
    }
    public String getBusiness_scope() {
        return business_scope;
    }
    public void setBusiness_scope(String business_scope) {
        this.business_scope = business_scope;
    }
    public String getIssuing_agence() {
        return issuing_agence;
    }
    public void setIssuing_agence(String issuing_agence) {
        this.issuing_agence = issuing_agence;
    }
    public String getGMP_GSP_issuing_date() {
        return GMP_GSP_issuing_date;
    }
    public void setGMP_GSP_issuing_date(String gMP_GSP_issuing_date) {
        GMP_GSP_issuing_date = gMP_GSP_issuing_date;
    }
    
}

