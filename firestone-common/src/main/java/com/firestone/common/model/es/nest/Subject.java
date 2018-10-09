package com.firestone.common.model.es.nest;

import java.io.Serializable;

/**
* @Description: (人才事实表专业领域壳套结构)
* @param
* @return
* @author wuzy
* @date 2018/8/7/007 13:45
*/
public class Subject implements Serializable {
    private static final long serialVersionUID = -5160761489781426562L;

    /**
    * @Fields name 专业名称
    */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
