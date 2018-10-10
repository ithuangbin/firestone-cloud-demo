package com.firestone.common.model.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Auther: huang
 * @Date: 2018/10/10 15:57
 * @Description:
 */
public class CompanySearchVo extends BaseParam {

    @ApiModelProperty(value = "类型", notes = "类型", example = "类型" ,required=true)
    private String type;
    @ApiModelProperty(value = "name", notes = "name", example = "name")
    private String name;
    @ApiModelProperty(value = "category", notes = "category", example = "category")
    private String category;
    @ApiModelProperty(value = "园区id", notes = "园区id", example = "园区id")
    private String parkId;
    @ApiModelProperty(value = "级别", notes = "级别", example = "级别")
    private String rank;
    @ApiModelProperty(value = "省code", notes = "省code", example = "省code")
    private String pCode;
    @ApiModelProperty(value = "市code", notes = "市code", example = "市code")
    private String cCode;
    @ApiModelProperty(value = "区县code", notes = "区县code", example = "区县code")
    private String aCode;
    @ApiModelProperty(value = "年份", notes = "yyyy", example = "yyyy" )
    private String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}