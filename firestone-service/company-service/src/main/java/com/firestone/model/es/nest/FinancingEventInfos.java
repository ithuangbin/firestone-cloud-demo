/**
 * Project Name:fire-industry-map
 * File Name:FinancingEventInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午10:24:01
 *
*/

package com.firestone.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 融资信息
 * @author lvxc
 * @date 2018年8月1日 下午10:24:01
 */
@ApiModel
public class FinancingEventInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    //源id
    @ApiModelProperty(value = "源id", example = "源id）")
    private String doc_id ;
    //融资轮次
    @ApiModelProperty(value = "融资轮次", example = "融资轮次）")
    private String financing_round_4010 ;
    //融资时间
    @ApiModelProperty(value = "融资时间", example = "融资时间）")
    private String financing_date_4010 ;
    //金额（描述）
    @ApiModelProperty(value = "金额（描述）", example = "金额（描述））")
    private String money ;
    //金额（数字）
    @ApiModelProperty(value = "金额（数字）", example = "金额（数字））")
    private String money_num ;
    //投资方（多）
    @ApiModelProperty(value = "投资方（多）", example = "投资方（多））")
    private String inv_short_name_4006 ;
    public String getDoc_id() {
        return doc_id;
    }
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
    public String getFinancing_round_4010() {
        return financing_round_4010;
    }
    public void setFinancing_round_4010(String financing_round_4010) {
        this.financing_round_4010 = financing_round_4010;
    }
    public String getFinancing_date_4010() {
        return financing_date_4010;
    }
    public void setFinancing_date_4010(String financing_date_4010) {
        this.financing_date_4010 = financing_date_4010;
    }
    public String getMoney() {
        return money;
    }
    public void setMoney(String money) {
        this.money = money;
    }
    public String getMoney_num() {
        return money_num;
    }
    public void setMoney_num(String money_num) {
        this.money_num = money_num;
    }
    public String getInv_short_name_4006() {
        return inv_short_name_4006;
    }
    public void setInv_short_name_4006(String inv_short_name_4006) {
        this.inv_short_name_4006 = inv_short_name_4006;
    }
    
}

