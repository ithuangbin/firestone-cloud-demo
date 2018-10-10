package com.firestone.common.model.es;

import com.firestone.common.model.constants.ElasticSearchConstants;
import com.firestone.common.model.es.nest.DescribeList;
import com.firestone.common.model.es.nest.Flow;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

/**
 * @param
 * @author hel
 * @Description: (商标 - 地图事实表实体类)
 * @return
 * @date 2018/9/10/023 9:25
 */
@Document(indexName = ElasticSearchConstants.DM_CYDN_BRAND_INFOS, type = "index")
public class CydnBrandInfos extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String reg_num;

    private String name;

    private String class_num;

    private String applicant_address_chi;

    private String reg_date;

    private String applicant_name_eng;

    private String unique_period;

    private String announcement_date;

    private String priority_date;

    private String announcement_num;

    private String agent;

    private String common_brand;

    private String applicant_name_chi;

    private String applicant_address_eng;

    private String inter_reg_date;

    private String late_specified_date;

    private String preliminary_date;

    private String iconurl;

    private String preliminary_num;

    private String similar_group;

    private String type;

    private List<Flow> flow;

    private List<DescribeList> describe_list;

    public String getReg_num() {
        return reg_num;
    }

    public void setReg_num(String reg_num) {
        this.reg_num = reg_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_num() {
        return class_num;
    }

    public void setClass_num(String class_num) {
        this.class_num = class_num;
    }

    public String getApplicant_address_chi() {
        return applicant_address_chi;
    }

    public void setApplicant_address_chi(String applicant_address_chi) {
        this.applicant_address_chi = applicant_address_chi;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public String getApplicant_name_eng() {
        return applicant_name_eng;
    }

    public void setApplicant_name_eng(String applicant_name_eng) {
        this.applicant_name_eng = applicant_name_eng;
    }

    public String getUnique_period() {
        return unique_period;
    }

    public void setUnique_period(String unique_period) {
        this.unique_period = unique_period;
    }

    public String getAnnouncement_date() {
        return announcement_date;
    }

    public void setAnnouncement_date(String announcement_date) {
        this.announcement_date = announcement_date;
    }

    public String getPriority_date() {
        return priority_date;
    }

    public void setPriority_date(String priority_date) {
        this.priority_date = priority_date;
    }

    public String getAnnouncement_num() {
        return announcement_num;
    }

    public void setAnnouncement_num(String announcement_num) {
        this.announcement_num = announcement_num;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getCommon_brand() {
        return common_brand;
    }

    public void setCommon_brand(String common_brand) {
        this.common_brand = common_brand;
    }

    public String getApplicant_name_chi() {
        return applicant_name_chi;
    }

    public void setApplicant_name_chi(String applicant_name_chi) {
        this.applicant_name_chi = applicant_name_chi;
    }

    public String getApplicant_address_eng() {
        return applicant_address_eng;
    }

    public void setApplicant_address_eng(String applicant_address_eng) {
        this.applicant_address_eng = applicant_address_eng;
    }

    public String getInter_reg_date() {
        return inter_reg_date;
    }

    public void setInter_reg_date(String inter_reg_date) {
        this.inter_reg_date = inter_reg_date;
    }

    public String getLate_specified_date() {
        return late_specified_date;
    }

    public void setLate_specified_date(String late_specified_date) {
        this.late_specified_date = late_specified_date;
    }

    public String getPreliminary_date() {
        return preliminary_date;
    }

    public void setPreliminary_date(String preliminary_date) {
        this.preliminary_date = preliminary_date;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public String getPreliminary_num() {
        return preliminary_num;
    }

    public void setPreliminary_num(String preliminary_num) {
        this.preliminary_num = preliminary_num;
    }

    public String getSimilar_group() {
        return similar_group;
    }

    public void setSimilar_group(String similar_group) {
        this.similar_group = similar_group;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Flow> getFlow() {
        return flow;
    }

    public void setFlow(List<Flow> flow) {
        this.flow = flow;
    }

    public List<DescribeList> getDescribe_list() {
        return describe_list;
    }

    public void setDescribe_list(List<DescribeList> describe_list) {
        this.describe_list = describe_list;
    }
}
