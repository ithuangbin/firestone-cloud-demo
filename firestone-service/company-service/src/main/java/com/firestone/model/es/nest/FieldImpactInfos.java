/**
 * Project Name:fire-industry-map
 * File Name:FieldImpactInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午5:56:01
 *
*/

package com.firestone.model.es.nest;

import java.io.Serializable;

/**
 * @Description: 领域影响信息
 * @author lvxc
 * @date 2018年8月1日 下午5:56:01
 */
public class FieldImpactInfos implements Serializable{
        
    private static final long serialVersionUID = 1L;

    //领域影响力分数
    private String num ;
    //领域名
    private String medical_label ;
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getMedical_label() {
        return medical_label;
    }
    public void setMedical_label(String medical_label) {
        this.medical_label = medical_label;
    }
    
    
}

