package com.firestone.common.model.es.nest;

import java.io.Serializable;

/**
* @Description: (地图人才事实表人物标签嵌套结构)
* @param
* @return
* @author wuzy
* @date 2018/8/6/006 13:37
*/
public class LabelInfos implements Serializable {
    private static final long serialVersionUID = -2321505569108688169L;
    
    /**
    * @Fields name 标签名称
    */
    private String label_name;
    
    /**
    * @Fields id 
    */
    private String id;
    
    /**
    * @Fields rank 人才类型
    */
    private String rank;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLabel_name() {
        return label_name;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name;
    }
}
