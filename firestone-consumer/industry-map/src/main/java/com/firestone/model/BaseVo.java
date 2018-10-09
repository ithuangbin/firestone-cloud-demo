/**
 * Project Name:fire-industry-map
 * File Name:BaseVo.java
 * Package Name:com.firestone.bean.vo.base
 * Date:2018年7月25日下午1:53:48
 *
*/

package com.firestone.model;


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
    private String id;
    
    private String areaId;

    private String pCode;

    private String cCode;

    private String aCode;
    
    private String parkId;
    
    private String year;
    
    private String label1 ;
    
    private String zizhi ;

    private String level ;
    
    private String type ;

    private String name ;
    
    private String build_no ;

    private String province ;

    private String city ;

    private String area ;
    
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

