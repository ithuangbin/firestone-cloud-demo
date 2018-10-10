package com.firestone.common.model.es.nest;

import java.io.Serializable;

public class Flow implements Serializable {

    private static final long serialVersionUID = 1L;

    private String state;

    private String time;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
