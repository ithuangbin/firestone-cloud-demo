package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
* @Description: (公司表对外投资信息)
* @param
* @return
* @author wuzy
* @date 2018/9/7/007 11:45
*/
@ApiModel
public class Entinv implements Serializable {
    private static final long serialVersionUID = -4354840683239907263L;
    
    /**
    * @Fields  :name (对外投资企业名称)
    */
    @ApiModelProperty(value = "对外投资企业名称", notes = "对外投资企业名称", example = "对外投资企业名称")
    private String name;
    
    /**
    * @Fields  :unicode (社会统一社会信用代码)
    */
    @ApiModelProperty(value = "社会统一社会信用代码", notes = "社会统一社会信用代码", example = "社会统一社会信用代码")
    private String unicode;
    
    /**
    * @Fields  :jingyingzhuangtai  (经营状态)
    */
    @ApiModelProperty(value = "经营状态", notes = "经营状态", example = "经营状态")
    private String jingyingzhuangtai ;
    
    /**
    * @Fields  :gongsileixing (企业类型)
    */
    @ApiModelProperty(value = "企业类型", notes = "企业类型", example = "企业类型")
    private String gongsileixing;
    
    /**
    * @Fields  :chengliriqi (成立日期)
    */
    @ApiModelProperty(value = "成立日期", notes = "成立日期", example = "成立日期")
    private String chengliriqi;
    
    /**
    * @Fields  :dengjijiguan (登记机关)
    */
    @ApiModelProperty(value = "登记机关", notes = "登记机关", example = "登记机关")
    private String dengjijiguan;
    
    /**
    * @Fields  :zhucehao (注册号)
    */
    @ApiModelProperty(value = "注册号", notes = "注册号", example = "注册号")
    private String zhucehao;
    
    /**
    * @Fields  :fadingdaibiao (法定代表)
    */
    @ApiModelProperty(value = "法定代表", notes = "法定代表", example = "法定代表")
    private String fadingdaibiao;
    
    /**
    * @Fields  :investment_amount (投资金额)
    */
    @ApiModelProperty(value = "投资金额", notes = "投资金额", example = "投资金额")
    private String investment_amount;
    
    /**
    * @Fields  :proportion (投资比例)
    */
    @ApiModelProperty(value = "投资比例", notes = "投资比例", example = "投资比例")
    private String proportion;
    
    /**
    * @Fields  :currency (币种)
    */
    @ApiModelProperty(value = "币种", notes = "币种", example = "币种")
    private String currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }

    public String getJingyingzhuangtai() {
        return jingyingzhuangtai;
    }

    public void setJingyingzhuangtai(String jingyingzhuangtai) {
        this.jingyingzhuangtai = jingyingzhuangtai;
    }

    public String getGongsileixing() {
        return gongsileixing;
    }

    public void setGongsileixing(String gongsileixing) {
        this.gongsileixing = gongsileixing;
    }

    public String getChengliriqi() {
        return chengliriqi;
    }

    public void setChengliriqi(String chengliriqi) {
        this.chengliriqi = chengliriqi;
    }

    public String getDengjijiguan() {
        return dengjijiguan;
    }

    public void setDengjijiguan(String dengjijiguan) {
        this.dengjijiguan = dengjijiguan;
    }

    public String getZhucehao() {
        return zhucehao;
    }

    public void setZhucehao(String zhucehao) {
        this.zhucehao = zhucehao;
    }

    public String getFadingdaibiao() {
        return fadingdaibiao;
    }

    public void setFadingdaibiao(String fadingdaibiao) {
        this.fadingdaibiao = fadingdaibiao;
    }

    public String getInvestment_amount() {
        return investment_amount;
    }

    public void setInvestment_amount(String investment_amount) {
        this.investment_amount = investment_amount;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
