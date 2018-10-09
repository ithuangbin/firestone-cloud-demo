/**
 * Project Name:fire-industry-map
 * File Name:LocationMansionInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午8:33:57
 *
*/

package com.firestone.common.model.es.nest;

import java.io.Serializable;

/**
 * @Description: 楼栋信息
 * @author lvxc
 * @date 2018年8月1日 下午8:33:57
 */
public class LocationMansionInfos implements Serializable{
        
    private static final long serialVersionUID = 1L;

    //大厦名称
    private String location_mansion ;
    //楼栋号
    private String location_mansion_building_No ;
    //楼栋层数
    private String location_mansion_building_storey ;
    
    public String getLocation_mansion() {
        return location_mansion;
    }
    public void setLocation_mansion(String location_mansion) {
        this.location_mansion = location_mansion;
    }
    public String getLocation_mansion_building_No() {
        return location_mansion_building_No;
    }
    public void setLocation_mansion_building_No(String location_mansion_building_No) {
        this.location_mansion_building_No = location_mansion_building_No;
    }
    public String getLocation_mansion_building_storey() {
        return location_mansion_building_storey;
    }
    public void setLocation_mansion_building_storey(
            String location_mansion_building_storey) {
        this.location_mansion_building_storey = location_mansion_building_storey;
    }
    
    
}

