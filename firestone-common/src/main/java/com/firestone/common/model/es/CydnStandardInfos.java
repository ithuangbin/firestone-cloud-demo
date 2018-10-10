package com.firestone.common.model.es;

import com.firestone.common.model.constants.ElasticSearchConstants;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = ElasticSearchConstants.DM_CYDN_STANDARD_INFOS,type = "index",createIndex = false)
public class CydnStandardInfos extends BaseEntity{
    private static final long serialVersionUID = 1L;
    private String standard_state;
    private String execute_date;
    private String number_of_pages;
    private String review_affirmance_date;
    private String type;
    private String standard_language;
    private String ccs;
    private String plan_num;
    private String price;
    private String standard_num;
    private String ics;
    private String record_notice;
    private String technical_committees;
    private String international_org;
    private String area;
    private String adopted_intl_standard_name;
    private String first_issuance_date;
    private String standard_title_cn;
    private String governor;
    private String drafting_committees;
    private String standard_nature;
    private String issuance_date;
    private String edition;
    private String industry_type;
    private String record_num;
    private String replaced_standard;
    private String execute_unit;
    private String adopted_intl_standard;
    private String propose_unit;
    private String replace_standard;
    private String standard_sort;
    private String standard_title_eg;
    private String apply_scope;
    private String standard_issuance_org;
    private String drafter;
    private String revocatory_date;
    private String application_degree;
    private String adopted_intl_standard_num;

    public String getStandard_state() {
        return standard_state;
    }

    public void setStandard_state(String standard_state) {
        this.standard_state = standard_state;
    }

    public String getExecute_date() {
        return execute_date;
    }

    public void setExecute_date(String execute_date) {
        this.execute_date = execute_date;
    }

    public String getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(String number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public String getReview_affirmance_date() {
        return review_affirmance_date;
    }

    public void setReview_affirmance_date(String review_affirmance_date) {
        this.review_affirmance_date = review_affirmance_date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStandard_language() {
        return standard_language;
    }

    public void setStandard_language(String standard_language) {
        this.standard_language = standard_language;
    }

    public String getCcs() {
        return ccs;
    }

    public void setCcs(String ccs) {
        this.ccs = ccs;
    }

    public String getPlan_num() {
        return plan_num;
    }

    public void setPlan_num(String plan_num) {
        this.plan_num = plan_num;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStandard_num() {
        return standard_num;
    }

    public void setStandard_num(String standard_num) {
        this.standard_num = standard_num;
    }

    public String getIcs() {
        return ics;
    }

    public void setIcs(String ics) {
        this.ics = ics;
    }

    public String getRecord_notice() {
        return record_notice;
    }

    public void setRecord_notice(String record_notice) {
        this.record_notice = record_notice;
    }

    public String getTechnical_committees() {
        return technical_committees;
    }

    public void setTechnical_committees(String technical_committees) {
        this.technical_committees = technical_committees;
    }

    public String getInternational_org() {
        return international_org;
    }

    public void setInternational_org(String international_org) {
        this.international_org = international_org;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAdopted_intl_standard_name() {
        return adopted_intl_standard_name;
    }

    public void setAdopted_intl_standard_name(String adopted_intl_standard_name) {
        this.adopted_intl_standard_name = adopted_intl_standard_name;
    }

    public String getFirst_issuance_date() {
        return first_issuance_date;
    }

    public void setFirst_issuance_date(String first_issuance_date) {
        this.first_issuance_date = first_issuance_date;
    }

    public String getStandard_title_cn() {
        return standard_title_cn;
    }

    public void setStandard_title_cn(String standard_title_cn) {
        this.standard_title_cn = standard_title_cn;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        this.governor = governor;
    }

    public String getDrafting_committees() {
        return drafting_committees;
    }

    public void setDrafting_committees(String drafting_committees) {
        this.drafting_committees = drafting_committees;
    }

    public String getStandard_nature() {
        return standard_nature;
    }

    public void setStandard_nature(String standard_nature) {
        this.standard_nature = standard_nature;
    }

    public String getIssuance_date() {
        return issuance_date;
    }

    public void setIssuance_date(String issuance_date) {
        this.issuance_date = issuance_date;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getIndustry_type() {
        return industry_type;
    }

    public void setIndustry_type(String industry_type) {
        this.industry_type = industry_type;
    }

    public String getRecord_num() {
        return record_num;
    }

    public void setRecord_num(String record_num) {
        this.record_num = record_num;
    }

    public String getReplaced_standard() {
        return replaced_standard;
    }

    public void setReplaced_standard(String replaced_standard) {
        this.replaced_standard = replaced_standard;
    }

    public String getExecute_unit() {
        return execute_unit;
    }

    public void setExecute_unit(String execute_unit) {
        this.execute_unit = execute_unit;
    }

    public String getAdopted_intl_standard() {
        return adopted_intl_standard;
    }

    public void setAdopted_intl_standard(String adopted_intl_standard) {
        this.adopted_intl_standard = adopted_intl_standard;
    }

    public String getPropose_unit() {
        return propose_unit;
    }

    public void setPropose_unit(String propose_unit) {
        this.propose_unit = propose_unit;
    }

    public String getReplace_standard() {
        return replace_standard;
    }

    public void setReplace_standard(String replace_standard) {
        this.replace_standard = replace_standard;
    }

    public String getStandard_sort() {
        return standard_sort;
    }

    public void setStandard_sort(String standard_sort) {
        this.standard_sort = standard_sort;
    }

    public String getStandard_title_eg() {
        return standard_title_eg;
    }

    public void setStandard_title_eg(String standard_title_eg) {
        this.standard_title_eg = standard_title_eg;
    }

    public String getApply_scope() {
        return apply_scope;
    }

    public void setApply_scope(String apply_scope) {
        this.apply_scope = apply_scope;
    }

    public String getStandard_issuance_org() {
        return standard_issuance_org;
    }

    public void setStandard_issuance_org(String standard_issuance_org) {
        this.standard_issuance_org = standard_issuance_org;
    }

    public String getDrafter() {
        return drafter;
    }

    public void setDrafter(String drafter) {
        this.drafter = drafter;
    }

    public String getRevocatory_date() {
        return revocatory_date;
    }

    public void setRevocatory_date(String revocatory_date) {
        this.revocatory_date = revocatory_date;
    }

    public String getApplication_degree() {
        return application_degree;
    }

    public void setApplication_degree(String application_degree) {
        this.application_degree = application_degree;
    }

    public String getAdopted_intl_standard_num() {
        return adopted_intl_standard_num;
    }

    public void setAdopted_intl_standard_num(String adopted_intl_standard_num) {
        this.adopted_intl_standard_num = adopted_intl_standard_num;
    }
}
