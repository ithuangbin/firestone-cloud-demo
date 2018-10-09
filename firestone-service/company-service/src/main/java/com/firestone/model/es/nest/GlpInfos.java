/**
 * Project Name:fire-industry-map
 * File Name:GlpInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午9:49:05
 *
*/

package com.firestone.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: GLP信息部分
 * @author lvxc
 * @date 2018年8月1日 下午9:49:05
 */
@ApiModel
public class GlpInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    //glp id
    @ApiModelProperty(value = "glp id", example = "glp id）")
    private String doc_id ;
    //认证批件编号
    @ApiModelProperty(value = "认证批件编号", example = "认证批件编号）")
    private String certification_documents_number ;
    //试验项目
    @ApiModelProperty(value = "认证批件编号", example = "认证批件编号）")
    private String test_item ;
    public String getDoc_id() {
        return doc_id;
    }
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
    public String getCertification_documents_number() {
        return certification_documents_number;
    }
    public void setCertification_documents_number(
            String certification_documents_number) {
        this.certification_documents_number = certification_documents_number;
    }
    public String getTest_item() {
        return test_item;
    }
    public void setTest_item(String test_item) {
        this.test_item = test_item;
    }
    
    
}

