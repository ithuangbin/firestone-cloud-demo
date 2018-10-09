/**
 * Project Name:fire-industry-map
 * File Name:BaseVo.java
 * Package Name:com.firestone.bean.vo.base
 * Date:2018年7月25日下午1:53:48
 *
*/

package com.firestone.common.model.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 基础类对象封装
 * @author lvxc
 * @date 2018年7月25日 下午1:53:48
 */
public class BaseVo implements Serializable{
    /**
    * @Fields  :id (id)
    */
    @ApiModelProperty(value = "id", notes = "id", example = "id")
    private String id;
    
    @ApiModelProperty(value = "产业地图ID", notes = "产业地图ID", example = "产业地图ID" ,required=true)
    private String areaId;

    @ApiModelProperty(value = "省级区域代码", notes = "省级区域代码", example = "省级区域代码")
    private String pCode;

    @ApiModelProperty(value = "城市区域代码", notes = "城市区域代码", example = "城市区域代码")
    private String cCode;

    @ApiModelProperty(value = "区级区域代码", notes = "区级区域代码", example = "区级区域代码")
    private String aCode;
    
    @ApiModelProperty(value = "产业园Id", notes = "产业园Id", example = "产业园Id")
    private String parkId;
    
    @ApiModelProperty(value = "查询年份", notes = "需要查询的年份", example = "2018" )
    private String year;
    
    @ApiModelProperty(value = "一级领域标签", notes = "一级领域标签", example = "药品，医疗器械" )
    private String label1 ;
    
    @ApiModelProperty(value = "资质", notes = "资质", example = "火炬项目" )
    private String zizhi ;

    @ApiModelProperty(value = "等级", notes = "等级", example = "等级" )
    private String level ;
    
    @ApiModelProperty(value = "类型", notes = "类型", example = "类型" )
    private String type ;

    @ApiModelProperty(value = "公司名称", notes = "公司名称", example = "公司名称" )
    private String name ;
    
    @ApiModelProperty(value = "楼栋号", notes = "楼栋号", example = "楼栋号" )
    private String build_no ;

    @ApiModelProperty(value = "省", notes = "省", example = "省" )
    private String province ;

    @ApiModelProperty(value = "市", notes = "市", example = "市" )
    private String city ;

    @ApiModelProperty(value = "区", notes = "区", example = "区" )
    private String area ;
    
    @ApiModelProperty(value = "用户定制化产业名", notes = "用户定制化产业名", example = "用户定制化产业名" )
    private String newLabel ;

    
    public String getNewLabel() {
        return newLabel;
    }

    public void setNewLabel(String newLabel) {
        this.newLabel = newLabel;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBuild_no() {
        return build_no;
    }

    public void setBuild_no(String build_no) {
        this.build_no = build_no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getZizhi() {
        return zizhi;
    }

    public void setZizhi(String zizhi) {
        this.zizhi = zizhi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getaCode() {
        return aCode;
    }

    public void setaCode(String aCode) {
        this.aCode = aCode;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

