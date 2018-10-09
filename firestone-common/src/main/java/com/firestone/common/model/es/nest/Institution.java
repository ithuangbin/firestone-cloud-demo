package com.firestone.common.model.es.nest;

import java.io.Serializable;

/**
* @Description: (人才事实表区域信息)
* @param
* @return
* @author wuzy
* @date 2018/8/6/006 10:57
*/
public class Institution implements Serializable {
    private static final long serialVersionUID = 8171342547863868386L;
    
    /**
    * @Fields endtime 结束时间
    */
    private String endtime;
    
    /**
    * @Fields institution_id 机构id
    */
    private String institution_id;
    
    /**
    * @Fields institution_position 
    */
    private String institution_position;
    
    /**
    * @Fields institution_type 机构类型
    */
    private String institution_type;
    
    /**
    * @Fields institutioncity_code 公司所在市代码
    */
    private String institutioncity_code;
    
    /**
    * @Fields institutioncounty_code 公司所在区代码
    */
    private String institutioncounty_code;
    
    /**
    * @Fields institutionprovince_code 公司所在省份代码
    */
    private String institutionprovince_code;
    
    /**
    * @Fields lat 
    */
    private String lat;
    
    /**
    * @Fields lng_lat 
    */
    private String lng_lat;
    
   /**
   * @Fields lon 
   */
   private String lon;
   
   /**
   * @Fields name 人物姓名
   */
   private String name;

   /**
   * @Fields starttime 任职开始时间
   */
   private String starttime;

    /**
     * @Fields type 开始标记
     */
    private Integer type;

    /**
     * @Fields address_city 市
     */
    private String address_city;

    /**
     * @Fields address_province 省
     */
    private String address_province;

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(String institution_id) {
        this.institution_id = institution_id;
    }

    public String getInstitution_position() {
        return institution_position;
    }

    public void setInstitution_position(String institution_position) {
        this.institution_position = institution_position;
    }

    public String getInstitution_type() {
        return institution_type;
    }

    public void setInstitution_type(String institution_type) {
        this.institution_type = institution_type;
    }

    public String getInstitutioncity_code() {
        return institutioncity_code;
    }

    public void setInstitutioncity_code(String institutioncity_code) {
        this.institutioncity_code = institutioncity_code;
    }

    public String getInstitutioncounty_code() {
        return institutioncounty_code;
    }

    public void setInstitutioncounty_code(String institutioncounty_code) {
        this.institutioncounty_code = institutioncounty_code;
    }

    public String getInstitutionprovince_code() {
        return institutionprovince_code;
    }

    public void setInstitutionprovince_code(String institutionprovince_code) {
        this.institutionprovince_code = institutionprovince_code;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng_lat() {
        return lng_lat;
    }

    public void setLng_lat(String lng_lat) {
        this.lng_lat = lng_lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddress_city() {
        return address_city;
    }

    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }

    public String getAddress_province() {
        return address_province;
    }

    public void setAddress_province(String address_province) {
        this.address_province = address_province;
    }
}
