package com.firestone.common.model.es.nest;

import java.io.Serializable;

public class DescribeList implements Serializable {

    private static final long serialVersionUID = 1L;

    private String describe;

    private String type;

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
