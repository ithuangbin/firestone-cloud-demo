package com.firestone.common.model.es;

import com.firestone.common.model.es.nest.*;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;


/**
* @Description: (人才事实表实体)
* @param
* @return
* @author wuzy
* @date 2018/8/6/006 10:51
*/
@Document(indexName = "dm_cydn_person_information_infos",type = "index",createIndex = false)
public class CydnPersonInformationInfos extends BaseEntity {

    private static final long serialVersionUID = -5484631402815280151L;
    /**
    * @Fields name 姓名
    */
    private String name;
    
    /**
    * @Fields name_english 英文名
    */
    private String name_english;
    
    /**
    * @Fields sex 性别
    */
    private String sex;
    
    /**
    * @Fields homeplace 籍贯
    */
    private String homeplace;
    
    /**
    * @Fields birthday 生日
    */
    private String birthday;

    /**
    * @Fields field 专业领域
    */
    private String field;
    
    /**
    * @Fields education 最高学历
    */
    private String education;
    
    /**
    * @Fields introduce 任务介绍
    */
    private String introduce;

    /**
     * @Fields rank 职称
     */
    private String rank;
    
    /**
    * @Fields url 人物照片
    */
    private String url;
    
    /**
    * @Fields institution_list
    */
    private List<Institution> institution_list;

    /**
    * @Fields honor_list
    */
    private List<Honor> honor_list;
    
    /**
    * @Fields label_infos 人物标签
    */
    private List<LabelInfos> label_infos;
    
    /**
    * @Fields field_infos 专业领域
    */
    private List<Subject> subject;

    /**
    * @Fields country 国籍
    */
    private String country;

    //人才id
    private String name_id ;
    
    /**
     * @Fields field_infos 专业领域
     */
    @ApiModelProperty(value = "关系网络")
    private List<Relation> relation;
    
    /**
    * @Fields  :cooperative_institution (合作机构)
    */
    @ApiModelProperty(value = "合作机构", notes = "合作机构", example = "合作机构")
    private List<CooperativeInstitution> cooperative_institution;

    @ApiModelProperty(value = "职务", notes = "职务", example = "职务")
    private String job;
    
    /**
    * @Fields  :inside_park_list (人才分布)
    */
    @ApiModelProperty(value = "人才分布", notes = "人才分布", example = "人才分布")
    private List<InsideParkList> inside_park_list;


    public List<InsideParkList> getInside_park_list() {
        return inside_park_list;
    }

    public void setInside_park_list(List<InsideParkList> inside_park_list) {
        this.inside_park_list = inside_park_list;
    }

    public List<Relation> getRelation() {
        return relation;
    }

    public void setRelation(List<Relation> relation) {
        this.relation = relation;
    }

    public List<CooperativeInstitution> getCooperative_institution() {
        return cooperative_institution;
    }

    public void setCooperative_institution(
            List<CooperativeInstitution> cooperative_institution) {
        this.cooperative_institution = cooperative_institution;
    }

    public String getName_id() {
        return name_id;
    }

    public void setName_id(String name_id) {
        this.name_id = name_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Institution> getInstitution_list() {
        return institution_list;
    }

    public void setInstitution_list(List<Institution> institution_list) {
        this.institution_list = institution_list;
    }

    public List<LabelInfos> getLabel_infos() {
        return label_infos;
    }

    public void setLabel_infos(List<LabelInfos> label_infos) {

        this.label_infos = label_infos;
    }

    public List<Honor> getHonor_list() {
        return honor_list;
    }

    public void setHonor_list(List<Honor> honor_list) {
        this.honor_list = honor_list;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public String getName_english() {
        return name_english;
    }

    public void setName_english(String name_english) {
        this.name_english = name_english;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHomeplace() {
        return homeplace;
    }

    public void setHomeplace(String homeplace) {
        this.homeplace = homeplace;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday!= null && birthday.length() > 4 ? birthday.substring(0, 4) : birthday;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
