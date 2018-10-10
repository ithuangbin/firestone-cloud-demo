package com.firestone.common.model;

import java.util.List;

/**
 * @Auther: huang
 * @Date: 2018/10/10 14:55
 * @Description:
 */
public class RespListDto<T> {

    private Long count;

    private List<T> list;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}