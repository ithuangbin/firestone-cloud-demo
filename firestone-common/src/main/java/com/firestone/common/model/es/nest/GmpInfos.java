/**
 * Project Name:fire-industry-map
 * File Name:GmpInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午9:38:48
 *
*/

package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: GMP信息部分
 * @author lvxc
 * @date 2018年8月1日 下午9:38:48
 */
@ApiModel
public class GmpInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    //GMP ID
    @ApiModelProperty(value = "GMP ID", example = "GMP ID")
    private String doc_id ;
    //证书编号
    @ApiModelProperty(value = "证书编号", example = "证书编号）")
    private String certificate_number ;
    //证书编号
    @ApiModelProperty(value = "认证范围", example = "认证范围")
    private String certificate_scope ;
    //发证机关
    @ApiModelProperty(value = "发证机关", example = "发证机关）")
    private String issuing_agence ;
    //发证日期
    @ApiModelProperty(value = "发证日期", example = "发证日期）")
    private String GMP_issuing_date;
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
    public String getCertificate_scope() {
        return certificate_scope;
    }
    public void setCertificate_scope(String certificate_scope) {
        this.certificate_scope = certificate_scope;
    }
    public String getIssuing_agence() {
        return issuing_agence;
    }
    public void setIssuing_agence(String issuing_agence) {
        this.issuing_agence = issuing_agence;
    }
    public String getGMP_issuing_date() {
        return GMP_issuing_date;
    }
    public void setGMP_issuing_date(String gMP_issuing_date) {
        GMP_issuing_date = gMP_issuing_date;
    }
    
}

