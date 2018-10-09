package com.firestone.service.impl;

import com.firestone.common.model.constants.ElasticSearchConstants;
import com.firestone.common.model.es.CydnMapProject;
import com.firestone.common.model.vo.BaseVo;
import com.firestone.common.service.BaseService;
import com.firestone.service.ICompanyService;
import org.apache.commons.lang.StringUtils;
import org.apache.lucene.search.join.ScoreMode;
import org.elasticsearch.common.Strings;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.NestedQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @Auther: huang
 * @Date: 2018/9/29 15:49
 * @Description:
 */
@Service
public class CompanyServiceImpl extends BaseService implements ICompanyService {


    @Override
    public Long getCompanyCount(BaseVo baseVo) {
        BoolQueryBuilder query = queryCompanyAdapter(baseVo);
        SearchQuery sq  =new NativeSearchQueryBuilder().withIndices(ElasticSearchConstants.PROJECT_INFOS).withTypes(ElasticSearchConstants.ES_TYPE).
                withQuery(query).build();
        long count = getElasticsearchOperations().count(sq);
        return count;
    }

    @Override
    public CydnMapProject getCompanyBasicInfo(String id, String areaId) {
        Assert.notNull(id,"企业id不能为空");
        Assert.notNull(areaId,"mapId不能为空");
        BoolQueryBuilder bool = new BoolQueryBuilder();
        bool.must(QueryBuilders.termQuery("company_id",id)).must(QueryBuilders.termQuery("map_id",areaId));
        StringQuery stringQuery  = new StringQuery(Strings.toString(bool));
        List<CydnMapProject> cydnMapProjects = getElasticsearchOperations().queryForList(stringQuery, CydnMapProject.class);
        CydnMapProject mapProject = new CydnMapProject();
        if (cydnMapProjects != null && cydnMapProjects.size() > 0){
            mapProject = cydnMapProjects.get(0);
        }
        return mapProject;
    }

    public static BoolQueryBuilder queryCompanyAdapter(BaseVo baseVo) {
        BoolQueryBuilder bool = new BoolQueryBuilder();
        if(!StringUtils.isBlank(baseVo.getId())){
            bool.must(QueryBuilders.termQuery("company_id", baseVo.getId()));
        }
        if(!StringUtils.isBlank(baseVo.getName())){
            BoolQueryBuilder bool1 = new BoolQueryBuilder();
            bool1.should(QueryBuilders.wildcardQuery("name", "*"+baseVo.getName()+"*"));
            bool1.should(QueryBuilders.matchPhraseQuery("cname",baseVo.getName()));
            bool.must(bool1);
        }
        if(!StringUtils.isBlank(baseVo.getAreaId())){
            bool.must(QueryBuilders.termQuery("map_id", baseVo.getAreaId()));
        }
        if (!StringUtils.isBlank(baseVo.getpCode())) {
            bool.must(QueryBuilders.termQuery("province_code", baseVo.getpCode()));
        }
        if (!StringUtils.isBlank(baseVo.getcCode())) {
            bool.must(QueryBuilders.termQuery("city_code", baseVo.getcCode()));
        }
        if (!StringUtils.isBlank(baseVo.getaCode())) {
            bool.must(QueryBuilders.termQuery("county_code", baseVo.getaCode()));
        }
        if (!StringUtils.isBlank(baseVo.getYear())) {
            bool.must(QueryBuilders.rangeQuery("chengliriqi_year").lte(baseVo.getYear()));
        }
        if(!StringUtils.isBlank(baseVo.getParkId())){
            NestedQueryBuilder nestedQuery = QueryBuilders.nestedQuery(
                    ElasticSearchConstants.ZAITI_INFOS,
                    QueryBuilders.termQuery(ElasticSearchConstants.ZAITI_INFOS_ID, baseVo.getParkId()),
                    ScoreMode.Total);
            bool.must(nestedQuery);
        }
        if(!StringUtils.isBlank(baseVo.getLabel1())){
            NestedQueryBuilder nestedQuery = QueryBuilders.nestedQuery(
                    ElasticSearchConstants.MEDICAL_LABEL,
                    QueryBuilders.termQuery(ElasticSearchConstants.MEDICAL_LABEL_LABEL_1, baseVo.getLabel1()),
                    ScoreMode.Total);
            bool.must(nestedQuery);
        }

        if(!StringUtils.isBlank(baseVo.getNewLabel())){
            NestedQueryBuilder nestedQuery = QueryBuilders.nestedQuery(
                    ElasticSearchConstants.LABEL,
                    QueryBuilders.termQuery(ElasticSearchConstants.LABEL_LABEL_1, baseVo.getNewLabel()),
                    ScoreMode.Total);
            bool.must(nestedQuery);
        }
        if(!StringUtils.isBlank(baseVo.getZizhi()) && !"其他".equals(baseVo.getZizhi())){
            NestedQueryBuilder nestedQuery = QueryBuilders.nestedQuery(
                    ElasticSearchConstants.ZIZHI_INFOS,
                    QueryBuilders.termsQuery(ElasticSearchConstants.ZIZHI_INFOS_NAME, baseVo.getZizhi().split(",")),
                    ScoreMode.Total);
            bool.must(nestedQuery);
        }
        if ("其他".equals(baseVo.getZizhi())){
            NestedQueryBuilder nestedQuery = QueryBuilders.nestedQuery(
                    ElasticSearchConstants.ZIZHI_INFOS,
                    QueryBuilders.existsQuery(ElasticSearchConstants.ZIZHI_INFOS_NAME), ScoreMode.Total);
            bool.must(nestedQuery);
        }
        if(!StringUtils.isBlank(baseVo.getType())){
            bool.must(QueryBuilders.wildcardQuery("classification", "*"+baseVo.getType()+"*"));
        }
        if(!StringUtils.isBlank(baseVo.getBuild_no())){
            NestedQueryBuilder nestedQuery = QueryBuilders.nestedQuery(
                    ElasticSearchConstants.LOCATION_MANSION_INFOS,
                    QueryBuilders.termQuery(ElasticSearchConstants.LOCATION_MANSION_INFOS_BUILD_NO, baseVo.getBuild_no()),
                    ScoreMode.Total);
            bool.must(nestedQuery);
        }
        return bool;
    }
}