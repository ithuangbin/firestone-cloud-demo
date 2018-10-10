package com.firestone.common.model.es.nest;

import java.io.Serializable;

/**
 * @param
 * @author wuzy
 * @Description: (药品受理表企业名称嵌套结构)
 * @return
 * @date 2018/8/24/024 16:09
 */
public class RelationInfos implements Serializable {

    private static final long serialVersionUID = 1L;

    //标准名称
    private String stand_name;
    //标准名称
    private String stand_id;
    //标准名称
    private String type;
    //标准名称
    private String identity;

    private String name;

    private String isnative;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsnative() {
        return isnative;
    }

    public void setIsnative(String isnative) {
        this.isnative = isnative;
    }

    public String getStand_name() {
        return stand_name;
    }

    public void setStand_name(String stand_name) {
        this.stand_name = stand_name;
    }

    public String getStand_id() {
        return stand_id;
    }

    public void setStand_id(String stand_id) {
        this.stand_id = stand_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
