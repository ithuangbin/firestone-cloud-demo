/**
 * Project Name:fire-industry-map
 * File Name:CydnMapProject.java
 * Package Name:com.firestone.bean.es
 * Date:2018年8月1日下午4:36:04
 *
*/

package com.firestone.common.model.es;

import com.firestone.common.model.constants.ElasticSearchConstants;
import com.firestone.common.model.es.nest.*;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 公司事实表对象实体
 * @author lvxc
 * @date 2018年8月1日 下午4:36:04
 */
@Document(indexName = ElasticSearchConstants.PROJECT_INFOS, type = "index", createIndex = false)
public class CydnMapProject implements Serializable{
        
    private static final long serialVersionUID = 1L;
    
    @Id
    private String id ;
    //公司id
    @ApiModelProperty(value = "公司id", example = "公司id")
    private String company_id ;
    //地图id
    @ApiModelProperty(value = "地图id", example = "地图id")
    private String map_id ;
    //公司名称
    @ApiModelProperty(value = "公司名称", example = "公司名称(杭州费尔斯通科技有限公司)")
    private String name ;
    //公司曾用名
    @ApiModelProperty(value = "公司曾用名", example = "公司曾用名(杭州费尔斯通科技有限公司)")
    private String cname ;
    //成立日期
    @ApiModelProperty(value = "公司成立日期", example = "公司成立日期")
    private String chengliriqi;
    //成立日期年份
    @ApiModelProperty(value = "成立日期年份", example = "成立日期年份")
    private String chengliriqi_year ;
    //登记机关
    @ApiModelProperty(value = "登记机关", example = "登记机关")
    private String dengjijiguan ;
    //公司描述
    @ApiModelProperty(value = "公司描述", example = "公司描述")
    private String describer ; 
    //邮箱地址
    @ApiModelProperty(value = "邮箱地址", example = "邮箱地址")
    private String email ;
    //开始时间
    @ApiModelProperty(value = "开始时间", example = "开始时间")
    private String start_date ;
    //结束时间
    @ApiModelProperty(value = "结束时间", example = "结束时间")
    private String end_date ;
    //法定代表
    @ApiModelProperty(value = "法定代表", example = "法定代表")
    private String fadingdaibiao ;
    //股东信息
    private List<Identity> founder ;
    //公司类型
    @ApiModelProperty(value = "公司类型", example = "公司类型")
    private String gongsileixing ;
    //官网信息
    @ApiModelProperty(value = "官网信息", example = "官网信息")
    private String homeurl ;
    //公司icon
    @ApiModelProperty(value = "公司icon", example = "公司icon")
    private String iconurl ;
    //经营范围
    @ApiModelProperty(value = "经营范围", example = "经营范围")
    private String jingyingfanwei ;
    //结束日期
    @ApiModelProperty(value = "结束日期", example = "结束日期")
    private String jieshuriqi ;
    //经营状态
    @ApiModelProperty(value = "经营状态", example = "经营状态")
    private String jingyingzhuangtai ;
    //主营业务
    @ApiModelProperty(value = "主营业务", example = "主营业务")
    private String main_business ;
    //变更信息
    @ApiModelProperty(value = "变更信息", example = "变更信息")
    private List<Milestones> milestones ;

    //注册资本
    @ApiModelProperty(value = "注册资本", example = "注册资本")
    private String zhuceziben ;
    //电话
    @ApiModelProperty(value = "电话", example = "电话")
    private String phone ;
    //人员规模
    @ApiModelProperty(value = "人员规模", example = "人员规模")
    private String scale ;
    //营业期限
    @ApiModelProperty(value = "营业期限", example = "营业期限")
    private String yingyeqixian ;
    //统一社会信用码
    @ApiModelProperty(value = "统一社会信用码", example = "统一社会信用码")
    private String unicode;
    //主要人员
    private List<Identity> team ;
    //公司画像
    @ApiModelProperty(value = "公司画像", example = "公司画像")
    private String portrait;
    //领域影响信息
    private List<FieldImpactInfos> field_impact_infos ;
    //公司所在省份
    @ApiModelProperty(value = "公司所在省份", example = "公司所在省份")
    private String address_province ;
    //公司所在城市
    @ApiModelProperty(value = "公司所在城市", example = "公司所在城市")
    private String address_city ;
    //公司所在县区
    @ApiModelProperty(value = "公司所在县区", example = "公司所在县区")
    private String address_area ;
    //注册地址
    @ApiModelProperty(value = "注册地址", example = "注册地址")
    private String address ;
    //公司所在省份代码
    @ApiModelProperty(value = "公司所在省份代码", example = "公司所在省份代码")
    private String province_code ;
    //公司所在城市代码
    @ApiModelProperty(value = "公司所在城市代码", example = "公司所在城市代码")
    private String city_code ;
    //公司所在县区代码
    @ApiModelProperty(value = "公司所在县区代码", example = "公司所在县区代码")
    private String county_code ;
    //经度
    @ApiModelProperty(value = "经度", example = "经度")
    private String lon ;
    //纬度
    @ApiModelProperty(value = "纬度", example = "纬度")
    private String lat ;
    //经纬度
    @ApiModelProperty(value = "经纬度", example = "经纬度")
    private String lng_lat ;
    //楼栋信息
    private List<LocationMansionInfos> location_mansion_infos ;
    //公司分类（重点，毕业，园外等）
    @ApiModelProperty(value = "公司分类（重点，毕业，园外等）", example = "公司分类（重点，毕业，园外等）")
    private String classification ;
    //制定标准
    private List<StandardInfos> standard_infos;
    //专利信息
    private List<PatentInfos> patent_infos ;
    //文献信息
    private List<LiteratureInfos> literature_infos ;
    //获批器械信息
    private List<MedicalEquipmentInfos> medical_equipment_infos ;
    //获批药品信息部分
    private List<DomesticDrugsInfos> domestic_drugs_infos ;
    //公司商标信息部分
    private List<BrandInfos> brand_infos ;
    //GMP信息部分
    private List<GmpInfos> gmp_infos ;
    //GMP信息部分
    private List<ZiZhiInfo> zizhi_infos ;
    //GSP信息部分
    private List<GspInfos> gsp_infos ;
    //GLP信息部分
    private List<GlpInfos> glp_infos ;
    //CNAS信息部分
    private List<CnasInfos> cnas_infos ;
    //投融资记录信息部分
    private List<FinancingEventInfos> financing_event_4010_infos ;
    //舆情动态信息部分
    private List<NewsInfos> news_infos ;
    //药品临床信息
    private List<CfdaClinicalDrugInfos> cfda_clinical_drug_infos;
    //药品受理状态信息
    private List<CfdaDrugsCdeInfos> cfda_drugs_cde_infos;
    //医健领域
    private List<MedicalLabel> medical_label;
    //课题
    private List<ProjectTableInfo> project_table_info;
    //对外投资
    private List<Entinv> entinv;
    //年报
    private List<YearReport> year_report;
    private String insuranced;

    //行业标签
    private List<Label> label;

    //上市信息
    private List<SimpleTable> simple_table_1090;
    
    public List<Label> getLabel() {
        return label;
    }
    public void setLabel(List<Label> label) {
        this.label = label;
    }
    public List<MedicalLabel> getMedical_label() {
        return medical_label;
    }
    public void setMedical_label(List<MedicalLabel> medical_label) {
        this.medical_label = medical_label;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCompany_id() {
        return company_id;
    }
    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }
    public String getMap_id() {
        return map_id;
    }
    public void setMap_id(String map_id) {
        this.map_id = map_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getChengliriqi() {
        return chengliriqi;
    }
    public void setChengliriqi(String chengliriqi) {
        this.chengliriqi = chengliriqi;
    }
    public String getChengliriqi_year() {
        return chengliriqi_year;
    }
    public void setChengliriqi_year(String chengliriqi_year) {
        this.chengliriqi_year = chengliriqi_year;
    }
    public String getDengjijiguan() {
        return dengjijiguan;
    }
    public void setDengjijiguan(String dengjijiguan) {
        this.dengjijiguan = dengjijiguan;
    }
    public String getDescriber() {
        return describer;
    }
    public void setDescriber(String describer) {
        this.describer = describer;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getStart_date() {
        return start_date;
    }
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
    public String getEnd_date() {
        return end_date;
    }
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
    public String getFadingdaibiao() {
        return fadingdaibiao;
    }
    public void setFadingdaibiao(String fadingdaibiao) {
        this.fadingdaibiao = fadingdaibiao;
    }
    public List<Identity> getFounder() {
        return founder;
    }
    public void setFounder(List<Identity> founder) {
        this.founder = founder;
    }
    public String getGongsileixing() {
        return gongsileixing;
    }
    public void setGongsileixing(String gongsileixing) {
        this.gongsileixing = gongsileixing;
    }
    public String getHomeurl() {
        return homeurl;
    }
    public void setHomeurl(String homeurl) {
        this.homeurl = homeurl;
    }
    public String getIconurl() {
        return iconurl;
    }
    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }
    public String getJingyingfanwei() {
        return jingyingfanwei;
    }
    public void setJingyingfanwei(String jingyingfanwei) {
        this.jingyingfanwei = jingyingfanwei;
    }
    public String getJieshuriqi() {
        return jieshuriqi;
    }
    public void setJieshuriqi(String jieshuriqi) {
        this.jieshuriqi = jieshuriqi;
    }
    public String getJingyingzhuangtai() {
        return jingyingzhuangtai;
    }
    public void setJingyingzhuangtai(String jingyingzhuangtai) {
        this.jingyingzhuangtai = jingyingzhuangtai;
    }
    public String getMain_business() {
        return main_business;
    }
    public void setMain_business(String main_business) {
        this.main_business = main_business;
    }
    public List<Milestones> getMilestones() {
        return milestones;
    }
    public void setMilestones(List<Milestones> milestones) {
        this.milestones = milestones;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getScale() {
        return scale;
    }
    public void setScale(String scale) {
        this.scale = scale;
    }
    public String getYingyeqixian() {
        return yingyeqixian;
    }
    public void setYingyeqixian(String yingyeqixian) {
        this.yingyeqixian = yingyeqixian;
    }
    public String getUnicode() {
        return unicode;
    }
    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }
    public List<Identity> getTeam() {
        return team;
    }
    public void setTeam(List<Identity> team) {
        this.team = team;
    }
    public String getPortrait() {
        return portrait;
    }
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }
    public List<FieldImpactInfos> getField_impact_infos() {
        return field_impact_infos;
    }
    public void setField_impact_infos(List<FieldImpactInfos> field_impact_infos) {
        this.field_impact_infos = field_impact_infos;
    }

    public List<ZiZhiInfo> getZizhi_infos() {
        return zizhi_infos;
    }

    public void setZizhi_infos(List<ZiZhiInfo> zizhi_infos) {
        this.zizhi_infos = zizhi_infos;
    }

    public List<StandardInfos> getStandard_infos() {
        return standard_infos;
    }

    public void setStandard_infos(List<StandardInfos> standard_infos) {
        this.standard_infos = standard_infos;
    }

    public String getZhuceziben() {
        return zhuceziben;
    }
    public void setZhuceziben(String zhuceziben) {
        this.zhuceziben = zhuceziben;
    }
    public String getAddress_province() {
        return address_province;
    }
    public void setAddress_province(String address_province) {
        this.address_province = address_province;
    }
    public String getAddress_city() {
        return address_city;
    }
    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }
    public String getAddress_area() {
        return address_area;
    }
    public void setAddress_area(String address_area) {
        this.address_area = address_area;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getProvince_code() {
        return province_code;
    }
    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }
    public String getCity_code() {
        return city_code;
    }
    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }
    public String getCounty_code() {
        return county_code;
    }
    public void setCounty_code(String county_code) {
        this.county_code = county_code;
    }
    public String getLon() {
        return lon;
    }
    public void setLon(String lon) {
        this.lon = lon;
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
    public List<LocationMansionInfos> getLocation_mansion_infos() {
        return location_mansion_infos;
    }
    public void setLocation_mansion_infos(
            List<LocationMansionInfos> location_mansion_infos) {
        this.location_mansion_infos = location_mansion_infos;
    }
    public String getClassification() {
        return classification;
    }
    public void setClassification(String classification) {
        this.classification = classification;
    }
    public List<PatentInfos> getPatent_infos() {
        return patent_infos;
    }
    public void setPatent_infos(List<PatentInfos> patent_infos) {
        this.patent_infos = patent_infos;
    }
    public List<LiteratureInfos> getLiterature_infos() {
        return literature_infos;
    }
    public void setLiterature_infos(List<LiteratureInfos> literature_infos) {
        this.literature_infos = literature_infos;
    }
    public List<MedicalEquipmentInfos> getMedical_equipment_infos() {
        return medical_equipment_infos;
    }
    public void setMedical_equipment_infos(
            List<MedicalEquipmentInfos> medical_equipment_infos) {
        this.medical_equipment_infos = medical_equipment_infos;
    }
    public List<DomesticDrugsInfos> getDomestic_drugs_infos() {
        return domestic_drugs_infos;
    }
    public void setDomestic_drugs_infos(
            List<DomesticDrugsInfos> domestic_drugs_infos) {
        this.domestic_drugs_infos = domestic_drugs_infos;
    }
    public List<BrandInfos> getBrand_infos() {
        return brand_infos;
    }
    public void setBrand_infos(List<BrandInfos> brand_infos) {
        this.brand_infos = brand_infos;
    }

    public List<GmpInfos> getGmp_infos() {
        return gmp_infos;
    }

    public void setGmp_infos(List<GmpInfos> gmp_infos) {
        this.gmp_infos = gmp_infos;
    }

    public List<GspInfos> getGsp_infos() {
        return gsp_infos;
    }

    public void setGsp_infos(List<GspInfos> gsp_infos) {
        this.gsp_infos = gsp_infos;
    }

    public List<GlpInfos> getGlp_infos() {
        return glp_infos;
    }

    public void setGlp_infos(List<GlpInfos> glp_infos) {
        this.glp_infos = glp_infos;
    }

    public List<CnasInfos> getCnas_infos() {
        return cnas_infos;
    }

    public void setCnas_infos(List<CnasInfos> cnas_infos) {
        this.cnas_infos = cnas_infos;
    }

    public List<FinancingEventInfos> getFinancing_event_4010_infos() {
        return financing_event_4010_infos;
    }
    public void setFinancing_event_4010_infos(
            List<FinancingEventInfos> financing_event_4010_infos) {
        this.financing_event_4010_infos = financing_event_4010_infos;
    }
    public List<NewsInfos> getNews_infos() {
        return news_infos;
    }
    public void setNews_infos(List<NewsInfos> news_infos) {
        this.news_infos = news_infos;
    }
    public List<CfdaClinicalDrugInfos> getCfda_clinical_drug_infos() {
        return cfda_clinical_drug_infos;
    }
    public void setCfda_clinical_drug_infos(
            List<CfdaClinicalDrugInfos> cfda_clinical_drug_infos) {
        this.cfda_clinical_drug_infos = cfda_clinical_drug_infos;
    }
    public List<CfdaDrugsCdeInfos> getCfda_drugs_cde_infos() {
        return cfda_drugs_cde_infos;
    }
    public void setCfda_drugs_cde_infos(List<CfdaDrugsCdeInfos> cfda_drugs_cde_infos) {
        this.cfda_drugs_cde_infos = cfda_drugs_cde_infos;
    }

    public List<ProjectTableInfo> getProject_table_info() {
        return project_table_info;
    }

    public void setProject_table_info(List<ProjectTableInfo> project_table_info) {
        this.project_table_info = project_table_info;
    }

    public List<Entinv> getEntinv() {
        return entinv;
    }

    public void setEntinv(List<Entinv> entinv) {
        this.entinv = entinv;
    }

    public List<YearReport> getYear_report() {
        return year_report;
    }

    public void setYear_report(List<YearReport> year_report) {
        if (year_report != null && !year_report.isEmpty()){
            try{
                List<YearReport> yearReports = year_report.stream()
                        .sorted(Comparator.comparing(YearReport::getReport_period).reversed()).collect(Collectors.toList());
                this.setInsuranced(yearReports.get(0).getInsuranced());
            }catch (Exception e){
            }
        }
        this.year_report = year_report;
    }

    public String getInsuranced() {
        return insuranced;
    }

    public void setInsuranced(String insuranced) {
        this.insuranced = insuranced;
    }

    public List<SimpleTable> getSimple_table_1090() {
        return simple_table_1090;
    }

    public void setSimple_table_1090(List<SimpleTable> simple_table_1090) {
        this.simple_table_1090 = simple_table_1090;
    }
}

