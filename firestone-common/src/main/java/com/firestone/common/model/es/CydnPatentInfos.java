package com.firestone.common.model.es;

import com.alibaba.fastjson.annotation.JSONField;
import com.firestone.common.model.es.nest.RelationInfos;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.List;

/**
 * 专利事实表
 * YangKuo 2018/8/23 11:00
 */
@Document(indexName = "dm_cydn_patent_infos", type = "index")
public class CydnPatentInfos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @JSONField(name = "id")
    private String id;

    /**
     * mapId : (地图id)
     */
    @JSONField(name = "mapId")
    private String map_id;

    /**
     * 专利名称
     */
    @JSONField(name = "title")
    private String title;

    /**
     * 专利类型
     */
    @JSONField(name = "patentType")
    private String shenqingleixing;

    /**
     * 专利状态
     */
    @JSONField(name = "patentStatus")
    private String patent_status;

    /**
     * 申请日期
     */
    @JSONField(name = "applicationDate")
    private String application_date;

    /**
     * 申请日期
     */
    @JSONField(name = "applicationNum")
    private String application_num;

    /**
     * 期限届满日
     */
    @JSONField(name = "expTime")
    private String exp_time;

    /**
     * 专利号
     */
    @JSONField(name = "patentNo")
    private String publication_num;

    /**
     * 当前申请(专利权)人
     */
    @JSONField(name = "applicantNow")
    private String applicant_now;

    /**
     * 申请(专利权)人
     */
    @JSONField(name = "applicant")
    private String applicant;

    private String ipc_classification_number;

    private String summary;

    private List<RelationInfos> relation_infos;

    public List<RelationInfos> getRelation_infos() {
        return relation_infos;
    }

    public void setRelation_infos(List<RelationInfos> relation_infos) {
        this.relation_infos = relation_infos;
    }

    public String getMap_id() {
        return map_id;
    }

    public void setMap_id(String map_id) {
        this.map_id = map_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShenqingleixing() {
        return shenqingleixing;
    }

    public void setShenqingleixing(String shenqingleixing) {
        this.shenqingleixing = shenqingleixing;
    }

    public String getPatent_status() {
        return patent_status;
    }

    public void setPatent_status(String patent_status) {
        this.patent_status = patent_status;
    }

    public String getApplication_date() {
        return application_date;
    }

    public void setApplication_date(String application_date) {
        this.application_date = application_date;
    }

    public String getExp_time() {
        return exp_time;
    }

    public void setExp_time(String exp_time) {
        this.exp_time = exp_time;
    }

    public String getPublication_num() {
        return publication_num;
    }

    public void setPublication_num(String publication_num) {
        this.publication_num = publication_num;
    }

    public String getApplicant_now() {
        return applicant_now;
    }

    public void setApplicant_now(String applicant_now) {
        this.applicant_now = applicant_now;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplication_num() {
        return application_num;
    }

    public void setApplication_num(String application_num) {
        this.application_num = application_num;
    }

    public String getIpc_classification_number() {
        return ipc_classification_number;
    }

    public void setIpc_classification_number(String ipc_classification_number) {
        this.ipc_classification_number = ipc_classification_number;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
