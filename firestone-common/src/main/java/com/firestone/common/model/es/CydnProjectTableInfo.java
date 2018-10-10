package com.firestone.common.model.es;

import com.firestone.common.model.constants.ElasticSearchConstants;
import com.firestone.common.model.es.nest.RelationInfos;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

/**
 * @author hel
 * @Description: (地图 - 重点项目)
 * @return
 * @date 2018/7/23/023 10:32
 */
@Document(indexName = ElasticSearchConstants.DM_CYDN_PROJECT_TABLE_INFO, type = "index", createIndex = false)
public class CydnProjectTableInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    //项目名称
    private String project_name;

    //负责人
    private String principal;

    //省份
    private String address_province;

    //项目编号
    private String project_id;

    //批准时间
    private String approval_time;

    //批准年份
    private String approval_year;

    //级别
    private String rank;

    //单位名称
    private String company;

    //人物id
    private String person_id;

    //项目类型
    private String item;

    //计划进度
    private String period;

    //下达文号
    private String document_number;

    //推荐单位
    private String referral_unit;

    //项目总经费
    private String total_funding;

    //主管部门
    private String competent_department;

    //项目实施周期（年）
    private String cycle_time;

    //企业名称
    private List<RelationInfos> relation_infos;

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getAddress_province() {
        return address_province;
    }

    public void setAddress_province(String address_province) {
        this.address_province = address_province;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getApproval_time() {
        return approval_time;
    }

    public void setApproval_time(String approval_time) {
        this.approval_time = approval_time;
    }

    public String getApproval_year() {
        return approval_year;
    }

    public void setApproval_year(String approval_year) {
        this.approval_year = approval_year;
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

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDocument_number() {
        return document_number;
    }

    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }

    public String getReferral_unit() {
        return referral_unit;
    }

    public void setReferral_unit(String referral_unit) {
        this.referral_unit = referral_unit;
    }

    public String getTotal_funding() {
        return total_funding;
    }

    public void setTotal_funding(String total_funding) {
        this.total_funding = total_funding;
    }

    public String getCompetent_department() {
        return competent_department;
    }

    public void setCompetent_department(String competent_department) {
        this.competent_department = competent_department;
    }

    public String getCycle_time() {
        return cycle_time;
    }

    public void setCycle_time(String cycle_time) {
        this.cycle_time = cycle_time;
    }

    public List<RelationInfos> getRelation_infos() {
        return relation_infos;
    }

    public void setRelation_infos(List<RelationInfos> relation_infos) {
        this.relation_infos = relation_infos;
    }
}
