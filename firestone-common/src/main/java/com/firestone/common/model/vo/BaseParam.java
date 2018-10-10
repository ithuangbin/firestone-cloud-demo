/**
 * Project Name:fire-industry-map
 * File Name:BaseParam.java
 * Package Name:com.firestone.bean.vo.base
 * Date:2018年7月25日下午1:53:48
 *
*/

package com.firestone.common.model.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


public class BaseParam implements Serializable{
    /**
    * @Fields  :id (id)
    */
    @ApiModelProperty(value = "id", notes = "id", example = "id")
    private String id;
    
    @ApiModelProperty(value = "产业地图ID", notes = "产业地图ID", example = "产业地图ID" ,required=true)
    private String areaId;

    @ApiModelProperty(value = "是否分页", notes = "是否分页", example = "是否分页")
    private Boolean pageAble=false;

    @ApiModelProperty(value = "页码", notes = "页码", example = "页码")
    private Integer page = 1;

    @ApiModelProperty(value = "每页显示数量", notes = "每页显示数量", example = "每页显示数量")
    private Integer size = 10;

    @ApiModelProperty(value = "排序字段", notes = "排序字段", example = "排序字段" )
    private String sort;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Boolean getPageAble() {
        return pageAble;
    }

    public void setPageAble(Boolean pageAble) {
        this.pageAble = pageAble;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BaseParam() {
    }

    public BaseParam(String id, String areaId) {
        this.id = id;
        this.areaId = areaId;
    }
}

