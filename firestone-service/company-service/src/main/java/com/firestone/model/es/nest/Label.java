package com.firestone.model.es.nest;

import com.firestone.model.es.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @Description: (行业标签嵌套)
* @param
* @return
* @author wuzy
* @date 2018/7/23/023 10:46
*/
@ApiModel
public class Label extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "一级领域标签", example = "一级领域标签")
    private String label1 ;
    @ApiModelProperty(value = "二级领域标签", example = "二级领域标签")
    private String label2 ;
    @ApiModelProperty(value = "三级领域标签", example = "三级领域标签")
    private String label3 ;
    @ApiModelProperty(value = "四级领域标签", example = "四级领域标签")
    private String label4 ;
    @ApiModelProperty(value = "五级领域标签", example = "五级领域标签")
    private String label5 ;
    public String getLabel1() {
        return label1;
    }
    public void setLabel1(String label1) {
        this.label1 = label1;
    }
    public String getLabel2() {
        return label2;
    }
    public void setLabel2(String label2) {
        this.label2 = label2;
    }
    public String getLabel3() {
        return label3;
    }
    public void setLabel3(String label3) {
        this.label3 = label3;
    }
    public String getLabel4() {
        return label4;
    }
    public void setLabel4(String label4) {
        this.label4 = label4;
    }
    public String getLabel5() {
        return label5;
    }
    public void setLabel5(String label5) {
        this.label5 = label5;
    }
}
