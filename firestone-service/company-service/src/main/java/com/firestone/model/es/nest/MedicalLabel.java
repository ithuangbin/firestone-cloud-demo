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
public class MedicalLabel extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "一级领域标签", example = "一级领域标签")
    private String label_1 ;
    @ApiModelProperty(value = "二级领域标签", example = "二级领域标签")
    private String label_2 ;
    @ApiModelProperty(value = "三级领域标签", example = "三级领域标签")
    private String label_3 ;
    @ApiModelProperty(value = "四级领域标签", example = "四级领域标签")
    private String label_4 ;
    @ApiModelProperty(value = "五级领域标签", example = "五级领域标签")
    private String label_5 ;

    public String getLabel_1() {
        return label_1;
    }

    public void setLabel_1(String label_1) {
        this.label_1 = label_1;
    }

    public String getLabel_2() {
        return label_2;
    }

    public void setLabel_2(String label_2) {
        this.label_2 = label_2;
    }

    public String getLabel_3() {
        return label_3;
    }

    public void setLabel_3(String label_3) {
        this.label_3 = label_3;
    }

    public String getLabel_4() {
        return label_4;
    }

    public void setLabel_4(String label_4) {
        this.label_4 = label_4;
    }

    public String getLabel_5() {
        return label_5;
    }

    public void setLabel_5(String label_5) {
        this.label_5 = label_5;
    }
    
    

}
