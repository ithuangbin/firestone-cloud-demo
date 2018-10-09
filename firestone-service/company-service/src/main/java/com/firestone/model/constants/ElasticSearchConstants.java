/**
 * Project Name:fire-industry-map
 * File Name:ElasticSearchConstants.java
 * Package Name:com.firestone.config.constants
 * Date:2018年7月18日下午8:56:18
 *
*/

package com.firestone.model.constants;

import java.util.LinkedHashMap;

/**
 * @Description: ES用到的相关常量
 * @author lvxc
 * @date 2018年7月18日 下午8:56:18
 */
public class ElasticSearchConstants {
    /**事实表模块**/
    //公司事实表
    public static final String PROJECT_INFOS = "dm_cydn_map_project";
    //动态事实表
    public static final String CYDN_INDUSTRY_TRENDS ="dm_cydn_industry_trends";
    //产园区事实表
    public static final String CYDN_INNOVATION_CARRIER ="dm_cydn_map_innovation_carrier_new";

    //人才事实表
    public static final String CYDN_PERSON_INFORMATION_INFOS ="dm_cydn_person_information_infos";

    //药品受理表
    public static final String CYDN_CFDA_DRUGS_CDE_INFOS = "dm_cydn_cfda_drugs_cde_infos";

    //文献事实表
    public static final String CYDN_LITERATURE_FACT_INFOS = "dm_cydn_literature_fact_infos";

    //人才标签表
    public static final String DM_MAP_PERSON_LABEL_CODE ="dm_map_person_label_code";

    //医疗服务表
    public static final String CYDN_MEDICAL_SERVICE_INFOS ="dm_cydn_medical_service_infos";

    //全国高校信息表
    public static final String DM_MAP_UNIVERSITY = "dm_map_university" ;
    //医疗卫生机构表
    public static final String DM_MAP_MEDICAL_INSTITUTION = "dm_map_medical_institution";
    //科研机构表
    public static final String DM_MAP_RESEARCH_INSTITUTION = "dm_map_research_institution";
    
    //专业平台事实表
    public static final String CYDN_PROFESSIONAL_PLATFORM_INFOS = "dm_cydn_professional_platform_infos" ;
    
    //国内文献表
    public static final String DM_MAP_LITERATURE_CN = "dm_map_literature_cn";
    //国家重点研发计划表
    public static final String DM_MAP_PROJECT_TABLE = "dm_map_project_table";

    //制定标准事实表
    public static final String DM_CYDN_STANDARD_INFOS = "dm_cydn_standard_infos";

    //商标事实表
    public static final String DM_CYDN_BRAND_INFOS = "dm_cydn_brand_infos";

    //重点研发项目事实表
    public static final String DM_CYDN_PROJECT_TABLE_INFO = "dm_cydn_project_table_info";

    //奖励表
    public static final String DM_MAP_TECHNOLOGY_AWARD = "dm_map_technology_award";

    //奖励表
    public static final String DM_CYDN_TECHNOLOGY_AWARD_INFOS = "dm_cydn_technology_award_infos";

    //一致性评价受理事实表
    public static final String DM_CYDN_CDE_CONSISTENCY_EVALUATION_TASK_INFO = "dm_cydn_cde_consistency_evaluation_task_info";

    //通过一致性评价事实表
    public static final String DM_CYDN_CDE_CONSISTENCY_EVALUATION_APPROVAL_INFO = "dm_cydn_cde_consistency_evaluation_approval_info";

    //器械受理表
    public static final String DM_CYDN_CFDA_MEDICAL_EQUIP_RECEVIED_INFO = "dm_cydn_cfda_medical_equip_recevied_info";

    //创新审评审评表
    public static final String DM_CYDN_CFDA_INNOVATE_ASSESS_INFO = "dm_cydn_cfda_innovate_assess_info";

    //产业地图mapId字段
    public static final String MAPID = "map_id";
    //es type 名
    public static final String ES_TYPE = "index";
    //es 产业领域标签 nested结构
    public static final String MEDICAL_LABEL = "medical_label";
    //es 产业领域一级标签
    public static final String MEDICAL_LABEL_LABEL_1 = "medical_label.label_1";
    //es 产业领域二级标签
    public static final String MEDICAL_LABEL_LABEL_2 = "medical_label.label_2";
    //es 产业领域三级标签
    public static final String MEDICAL_LABEL_LABEL_3 = "medical_label.label_3";
    //es 产业领域四级标签
    public static final String MEDICAL_LABEL_LABEL_4 = "medical_label.label_4";
    
    //es 新产业领域标签 nested结构
    public static final String LABEL = "label";
    //es 新产业领域一级标签
    public static final String LABEL_LABEL_1 = "label.label1";
    //es 新产业领域二级标签
    public static final String LABEL_LABEL_2 = "label.label2";
    //es 新产业领域三级标签
    public static final String LABEL_LABEL_3 = "label.label3";
    //es 新产业领域四级标签
    public static final String LABEL_LABEL_4 = "label.label4";

    //es 地图资质标签 nested 结构
    public static final String ZIZHI_INFOS ="zizhi_infos" ;
    //es 资质名称
    public static final String ZIZHI_INFOS_NAME = "zizhi_infos.zizhi_name" ;

    //es 产业动态公司信息nest
    public static final String COMPANY_INFOS = "company_infos";
    //nest 公司id
    public static final String COMPANY_INFOS_DOC_ID = "company_infos.doc_id";
    //nest 公司名
    public static final String COMPANY_INFOS_COMPANY_NAME = "company_infos.company_name";
    //nest 公司所在省行政区划码
    public static final String COMPANY_INFOS_PROVINCE_CODE = "company_infos.province_code";
    //nest 公司所在市行政区划码
    public static final String COMPANY_INFOS_CITY_CODE = "company_infos.city_code";
    //nest 公司所在区行政区划码
    public static final String COMPANY_INFOS_COUNTY_CODE = "company_infos.county_code";
    //es 载体/产业园信息nest
    public static final String ZAITI_INFOS = "zaiti_infos";
    //es 载体名称
    public static final String ZAITI_INFOS_NAME ="zaiti_infos.name";
    //es 载体id
    public static final String ZAITI_INFOS_ID ="zaiti_infos.id";
    //es 楼栋nest
    public static final String LOCATION_MANSION_INFOS = "location_mansion_infos";
    //
    public static final String LOCATION_MANSION_INFOS_BUILD_NO = "location_mansion_infos.location_mansion_building_no";
    //es 政策url_id
    public static final String URL_ID = "url_id";
    //es 政策发布时间
    public static final String PUBLISH_DATE = "publish_date";
    //es 是否医健
    public static final String ISMEDICAL = "ismedical";
    //es 政策发布年份
    public static final String PUBLISH_YEAR = "publish_year";
    //es 省行政区划码
    public static final String PROVINCE_CODE = "province_code";
    //es 市行政区划码
    public static final String CITY_CODE = "city_code";
    //es 区行政区划码
    public static final String COUNTY_CODE = "county_code";
    //es 详情id
    public static final String ID = "_id";
    //es 上一级政策
    public static final String PARENT_ID = "parent_id.id";
    //聚合类型nested
    public static final Integer AGGS_NESTED = 1;
    //聚合类型terms
    public static final Integer AGGS_TERMS = 0;
    //聚合类型reverseNested
    public static final Integer AGGS_REVERSE_NESTED = 2;

    /**
     * @Fields ES_SCROLL_DEFAULT_SIZE : (ES滚动查询默认页码)
     */
    public static final int ES_DEFAULT_SCROLL_PAGE = 0;

    /**
     * @Fields ES_SCROLL_DEFAULT_SIZE : (ES滚动查询默认大小)
     */
    public static final int ES_DEFAULT_SCROLL_SIZE = 10000;

    /**
     * @Fields ES_SCROLL_TIME_IN_MILLIS : (ES游标查询context默认存活时间3分钟（单位毫秒）)
     */
    public static final long ES_DEFAULT_SCROLL_TIME_IN_MILLIS = 180000L;

    //融资轮次字典
    public static LinkedHashMap<String, String> ROUND_CHART_DIC = new LinkedHashMap<String, String>() {
        private static final long serialVersionUID = 1L;
        {
            put("种子轮","种子轮,天使轮");
            put("A轮","A轮,Pre-A轮,A+轮");
            put("B轮","B轮,Pre-B轮,B+轮");
            put("C轮","C轮,Pre-C轮");
            put("D轮","D轮,Pre-D轮");
            put("D轮以后","E轮,F轮,F轮及以后,Pre-E,Pre-E,G轮");
            put("其他","PIPE,战略投资,不明确,收购");
        }
    };
}

