package com.firestone.common.model.es.nest;

import java.io.Serializable;

/**
* @Description: (人物事实表人物荣誉嵌套结构)
* @param
* @return
* @author wuzy
* @date 2018/8/9/009 19:33
*/
public class Honor implements Serializable {
    private static final long serialVersionUID = 7691293541585398464L;

    /**
    * @Fields time 成就获得时间
    */
    private String time;
    
    /**
    * @Fields details 成就详情
    */
    private String details;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
