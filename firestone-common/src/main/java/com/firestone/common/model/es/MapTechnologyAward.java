package com.firestone.common.model.es;

import com.firestone.common.model.constants.ElasticSearchConstants;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author hel
 * @Description: (地图 - 获奖情况表)
 * @return
 * @date 2018/7/23/023 10:32
 */
@Document(indexName = ElasticSearchConstants.DM_MAP_TECHNOLOGY_AWARD, type = "index", createIndex = false)
public class MapTechnologyAward extends BaseEntity{
        
    private static final long serialVersionUID = 1L;

    private String principal;

    private String item;

    private String address_province;

    private String year;

    private String referral_unit;

    private String rank;

    private String company;

    private String project_name;

    private String reward_levels;

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getAddress_province() {
        return address_province;
    }

    public void setAddress_province(String address_province) {
        this.address_province = address_province;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getReferral_unit() {
        return referral_unit;
    }

    public void setReferral_unit(String referral_unit) {
        this.referral_unit = referral_unit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getReward_levels() {
        return reward_levels;
    }

    public void setReward_levels(String reward_levels) {
        this.reward_levels = reward_levels;
    }
}
