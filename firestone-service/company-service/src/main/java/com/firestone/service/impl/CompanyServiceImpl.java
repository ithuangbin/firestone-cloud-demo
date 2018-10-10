package com.firestone.service.impl;

import com.firestone.common.model.RespListDto;
import com.firestone.common.model.constants.CommonConstants;
import com.firestone.common.model.constants.ElasticSearchConstants;
import com.firestone.common.model.constants.MapIdConstants;
import com.firestone.common.model.es.*;
import com.firestone.common.model.es.nest.StandardInfos;
import com.firestone.common.model.vo.BaseParam;
import com.firestone.common.model.vo.CompanySearchVo;
import com.firestone.common.service.BaseService;
import com.firestone.common.util.DateUtil;
import com.firestone.service.ICompanyService;
import org.apache.commons.lang.StringUtils;
import org.apache.lucene.search.join.ScoreMode;
import org.elasticsearch.common.Strings;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: huang
 * @Date: 2018/9/29 15:49
 * @Description:
 */
@Service
public class CompanyServiceImpl extends BaseService implements ICompanyService {

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @Override
    public CydnMapProject getCompanyBasicInfo(BaseParam baseParam) {
        Assert.notNull(baseParam.getId(),"企业id不能为空");
        Assert.notNull(baseParam.getAreaId(),"mapId不能为空");
        BoolQueryBuilder bool = new BoolQueryBuilder();
        bool.must(QueryBuilders.termQuery("company_id", baseParam.getId())).must(QueryBuilders.termQuery("map_id", baseParam.getAreaId()));

        StringQuery stringQuery  = new StringQuery(Strings.toString(bool));
        List<CydnMapProject> cydnMapProjects = elasticsearchOperations.queryForList(stringQuery, CydnMapProject.class);
        return cydnMapProjects.isEmpty()?new CydnMapProject():cydnMapProjects.get(0);
    }

    @Override
    public RespListDto standardInfo(CompanySearchVo searchVo) {
        Assert.notNull(searchVo.getId(),"企业id不能为空");
        Assert.notNull(searchVo.getAreaId(),"mapId不能为空");
        BaseParam baseParam = new BaseParam(searchVo.getId(),searchVo.getAreaId());
        CydnMapProject companyBasicInfo = getCompanyBasicInfo(baseParam);
        List<StandardInfos> standardInfos = companyBasicInfo.getStandard_infos();
        RespListDto respListDto = new RespListDto();
        if(!standardInfos.isEmpty()){
            //查询dm_cydn_standard_infos事实表详情，source_doc_id关联
            List<String> docIds = standardInfos.stream().map(StandardInfos::getDoc_id).collect(Collectors.toList());
            BoolQueryBuilder bool = new BoolQueryBuilder();
            bool.must(QueryBuilders.termsQuery("source_doc_id", docIds)).must(QueryBuilders.termQuery("map_id", searchVo.getAreaId()));
            if(StringUtils.isNotBlank(searchVo.getType())){
                String type = CommonConstants.STANDARD_TYPE.get(searchVo.getType());
                if (type != null){
                    bool.must(QueryBuilders.termsQuery("type",type));
                }
                bool.must(QueryBuilders.termQuery("type",type));
            }
            NativeSearchQuery sq = new NativeSearchQueryBuilder().withQuery(bool).build();
            sq.setPageable(PageRequest.of(searchVo.getPage() - 1, searchVo.getSize()));
            Page<CydnStandardInfos> standardInfoss = elasticsearchOperations.queryForPage(sq, CydnStandardInfos.class);
            respListDto.setCount(standardInfoss.getTotalElements());
            respListDto.setList(standardInfoss.getContent());
        }
        return respListDto;
    }

    @Override
    public RespListDto patentInfo(CompanySearchVo searchVo) {
        BoolQueryBuilder bool = getPatenBool(searchVo);
        RespListDto result = new RespListDto<>();
        NativeSearchQuery sq = new NativeSearchQueryBuilder().withQuery(bool).build();
        sq.setPageable(PageRequest.of(searchVo.getPage() - 1, searchVo.getSize()));
        sq.addSort(Sort.by("publication_date"));
        Page<CydnPatentInfos> queryForPage = elasticsearchOperations.queryForPage(sq, CydnPatentInfos.class);
        result.setList(queryForPage.getContent());
        result.setCount(queryForPage.getTotalElements());
        return result;
    }

    @Override
    public RespListDto literatureInfo(CompanySearchVo searchVo) {
        BoolQueryBuilder bool = getLiteratureBool(searchVo);
        RespListDto result = new RespListDto<>();
        NativeSearchQuery sq = new NativeSearchQueryBuilder().withQuery(bool).build();
        sq.setPageable(PageRequest.of(searchVo.getPage() - 1, searchVo.getSize()));
        sq.addSort(Sort.by("pubdate"));
        Page<CydnLiteratureFactInfos> queryForPage = elasticsearchOperations.queryForPage(sq, CydnLiteratureFactInfos.class);
        result.setList(queryForPage.getContent());
        result.setCount(queryForPage.getTotalElements());
        return result;
    }


    @Override
    public RespListDto brandInfo(CompanySearchVo searchVo) {
        RespListDto result = new RespListDto<>();
        BoolQueryBuilder bool = new BoolQueryBuilder();
        bool.must(QueryBuilders.termQuery(ElasticSearchConstants.MAPID,searchVo.getAreaId()));
        if (StringUtils.isNotBlank(searchVo.getName())) {
            bool.must(QueryBuilders.termQuery("applicant_name_chi", searchVo.getName()));
        }
        NativeSearchQuery sq = new NativeSearchQueryBuilder().withQuery(bool).build();
        sq.setPageable(PageRequest.of(searchVo.getPage() - 1, searchVo.getSize()));
        Page<CydnBrandInfos> cydnBrandInfos = elasticsearchOperations.queryForPage(sq, CydnBrandInfos.class);
        result.setList(cydnBrandInfos.getContent());
        result.setCount(cydnBrandInfos.getTotalElements());
        return result;
    }

    @Override
    public RespListDto newsInfo(CompanySearchVo searchVo) {
        RespListDto result = new RespListDto<>();
        BoolQueryBuilder bool = new BoolQueryBuilder();
        bool.must(QueryBuilders.termsQuery(ElasticSearchConstants.MAPID, searchVo.getAreaId()));
        if (StringUtils.isNotBlank(searchVo.getId())){
            bool.must(QueryBuilders.termsQuery("company_id",searchVo.getId()));
        }
        if (StringUtils.isNotBlank(searchVo.getName())){
            bool.must(QueryBuilders.termsQuery("name",searchVo.getName()));
        }
        String[] fields = new String[]{"name","cname"};
        NativeSearchQuery sq = new NativeSearchQueryBuilder().withQuery(bool).withFields(fields).build();
        Page<CydnMapProject> cydnMapProjects = elasticsearchOperations.queryForPage(sq, CydnMapProject.class);
        List<CydnMapProject> projects = cydnMapProjects.getContent();
        CydnMapProject project = null;
        if (!projects.isEmpty()){
            project = projects.get(0);
        }
        if (project != null){
            BoolQueryBuilder bool1 = new BoolQueryBuilder();
            BoolQueryBuilder shouldBool = new BoolQueryBuilder();
            shouldBool.should(QueryBuilders.matchPhraseQuery("content",project.getName()));
            shouldBool.should(QueryBuilders.matchPhraseQuery("title",project.getName()));
            bool1.must(shouldBool);
            if (StringUtils.isNotBlank(project.getCname())){
                String[] cnames = project.getCname().split("\t");
                BoolQueryBuilder shouldBool1 = new BoolQueryBuilder();
                for (String cname : cnames) {
                    shouldBool1.should(QueryBuilders.matchPhraseQuery("content",cname));
                    shouldBool1.should(QueryBuilders.matchPhraseQuery("title",cname));
                }
                bool1.must(shouldBool1);
            }
            String[] fields1 = new String[]{"title","host","publish_timestamp"};
            NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                    .withQuery(bool1).withFields(fields1).build();
            searchQuery.addSort(Sort.by("publish_timestamp").descending());
            searchQuery.setPageable(PageRequest.of(searchVo.getPage() - 1, searchVo.getSize()));
            Page<MapNews> mapNews = elasticsearchOperations.queryForPage(searchQuery, MapNews.class);
            result.setList(mapNews.getContent());
            result.setCount(mapNews.getTotalElements());
        }
        return result;
    }

    @Override
    public RespListDto talentInfo(CompanySearchVo searchVo) {
        RespListDto result = new RespListDto<>();
        BoolQueryBuilder bool = getTalentBool(searchVo);
        NativeSearchQuery sq = new NativeSearchQueryBuilder().withQuery(bool).build();
        sq.setPageable(PageRequest.of(searchVo.getPage() - 1, searchVo.getSize()));
        Page<CydnPersonInformationInfos> cydnPersonInformationInfos = elasticsearchOperations.queryForPage(sq, CydnPersonInformationInfos.class);
        List<CydnPersonInformationInfos> content = cydnPersonInformationInfos.getContent();
        if (!content.isEmpty() && StringUtils.isNotBlank(searchVo.getId())){
            content.forEach(l -> {
                if (l.getInstitution_list() != null && !l.getInstitution_list().isEmpty()){
                    l.getInstitution_list().forEach(k -> {
                        if (searchVo.getId().equals(k.getInstitution_id())){
                            if (StringUtils.isNotBlank(k.getInstitution_position())){
                                l.setJob(k.getInstitution_position());
                            }
                        }
                    });
                }
            });
        }
        result.setList(content);
        result.setCount(cydnPersonInformationInfos.getTotalElements());
        return result;
    }


    @Override
    public RespListDto projectInfo(CompanySearchVo searchVo) {
        RespListDto result = new RespListDto<>();
        BoolQueryBuilder bool = getProjectBool(searchVo);
        NativeSearchQuery sq = new NativeSearchQueryBuilder().withQuery(bool).build();
        sq.setPageable(PageRequest.of(searchVo.getPage() - 1, searchVo.getSize()));
        Page<CydnProjectTableInfo> cydnProjectTableInfos = elasticsearchOperations.queryForPage(sq, CydnProjectTableInfo.class);
        result.setList(cydnProjectTableInfos.getContent());
        result.setCount(cydnProjectTableInfos.getTotalElements());
        return result;
    }


    @Override
    public RespListDto awardInfo(CompanySearchVo searchVo) {
        Assert.notNull(searchVo.getName(),"企业名称不能为空");
        RespListDto result = new RespListDto<>();
        BoolQueryBuilder bool = new BoolQueryBuilder();
        bool.must(QueryBuilders.matchPhraseQuery("company",searchVo.getName()));
        NativeSearchQuery sq = new NativeSearchQueryBuilder().withQuery(bool).build();
        sq.setPageable(PageRequest.of(searchVo.getPage() - 1, searchVo.getSize()));
        Page<MapTechnologyAward> mapTechnologyAwards = elasticsearchOperations.queryForPage(sq, MapTechnologyAward.class);
        result.setList(mapTechnologyAwards.getContent());
        result.setCount(mapTechnologyAwards.getTotalElements());
        return result;
    }

    private BoolQueryBuilder getPatenBool(CompanySearchVo searchVo) {
        BoolQueryBuilder bool = areaBool(searchVo.getpCode() != null ? searchVo.getpCode() : "",
                searchVo.getcCode() != null ? searchVo.getcCode() : "", searchVo.getaCode() != null ? searchVo.getaCode() : "");
        bool.must(QueryBuilders.termQuery(ElasticSearchConstants.MAPID, searchVo.getAreaId()));
        if (StringUtils.isNotBlank(searchVo.getYear())) {
            String date = "publication_date";
            if (MapIdConstants.CDTF.equals(searchVo.getAreaId())) {
                date = "application_date";
            }
            bool.must(QueryBuilders.rangeQuery(date).format(DateUtil.yyyy)
                    .gte(searchVo.getYear()).lt(DateUtil.getNextTime(searchVo.getYear(), DateUtil.yyyy)));
        }
        if (StringUtils.isNotBlank(searchVo.getParkId())) {
            bool.must(QueryBuilders.nestedQuery("zaiti_infos", QueryBuilders.termQuery("zaiti_infos.id", searchVo.getParkId()), ScoreMode.Total));
        }
        if (StringUtils.isNotBlank(searchVo.getName())) {
            bool.must(QueryBuilders.nestedQuery("relation_infos",
                    QueryBuilders.termQuery("relation_infos.stand_name", searchVo.getName()), ScoreMode.Total));
        }
        if (MapIdConstants.HXXF.equals(searchVo.getAreaId()) || MapIdConstants.ZGDJK.equals(searchVo.getAreaId())) {
            bool.must(QueryBuilders.termQuery("shenqingleixing", "发明授权"));
        }
        return bool;
    }

    private BoolQueryBuilder getLiteratureBool(CompanySearchVo searchVo) {
        BoolQueryBuilder bool = areaBool(searchVo.getpCode() != null ? searchVo.getpCode() : "",
                searchVo.getcCode() != null ? searchVo.getcCode() : "", searchVo.getaCode() != null ? searchVo.getaCode() : "");
        bool.must(QueryBuilders.termQuery(ElasticSearchConstants.MAPID, searchVo.getAreaId()));
        if (StringUtils.isNotBlank(searchVo.getYear())) {
            bool.must(QueryBuilders.termQuery("pub_year", searchVo.getYear()));
        }
        if (StringUtils.isNotBlank(searchVo.getName())) {
            bool.must(QueryBuilders.nestedQuery("relation_infos",
                    QueryBuilders.termQuery("relation_infos.stand_name", searchVo.getName()), ScoreMode.Total));
        }
        if (StringUtils.isNotBlank(searchVo.getParkId())) {
            bool.must(QueryBuilders.nestedQuery("zaiti_infos", QueryBuilders.termQuery("zaiti_infos.id", searchVo.getParkId()), ScoreMode.Total));
        }
        return bool;
    }

    private BoolQueryBuilder getTalentBool(CompanySearchVo searchVo) {
        BoolQueryBuilder bool = new BoolQueryBuilder();
        bool.must(QueryBuilders.termQuery(ElasticSearchConstants.MAPID, searchVo.getAreaId()));
        if (StringUtils.isNotBlank(searchVo.getId())){
            bool.must(QueryBuilders.nestedQuery("institution_list",
                    QueryBuilders.termQuery("institution_list.institution_id",searchVo.getId()),ScoreMode.Total));
        }
        if (StringUtils.isNotBlank(searchVo.getName())){
            bool.must(QueryBuilders.nestedQuery("institution_list",
                    QueryBuilders.termQuery("institution_list.name",searchVo.getName()),ScoreMode.Total));
        }
        if (StringUtils.isNotBlank(searchVo.getRank())){
            bool.must(QueryBuilders.nestedQuery("label_infos",
                    QueryBuilders.termQuery("label_infos.rank",searchVo.getRank()),ScoreMode.Total));
        }
        return bool;
    }

    private BoolQueryBuilder getProjectBool(CompanySearchVo searchVo) {
        BoolQueryBuilder bool = new BoolQueryBuilder();
        bool.must(QueryBuilders.termQuery(ElasticSearchConstants.MAPID,searchVo.getAreaId()));
        if (StringUtils.isNotBlank(searchVo.getId())) {
            bool.must(QueryBuilders.nestedQuery("relation_infos",
                    QueryBuilders.termQuery("relation_infos.stand_id", searchVo.getId()), ScoreMode.Total));
        }
        if (StringUtils.isNotBlank(searchVo.getName())) {
            bool.must(QueryBuilders.nestedQuery("relation_infos",
                    QueryBuilders.termQuery("relation_infos.stand_name", searchVo.getName()), ScoreMode.Total));
        }
        return bool;
    }

    private BoolQueryBuilder areaBool(String province, String city, String area) {
        BoolQueryBuilder bool = new BoolQueryBuilder();
        if (StringUtils.isNotBlank(province)) {
            bool.must(QueryBuilders.nestedQuery("relation_infos",
                    QueryBuilders.termQuery("relation_infos.province_code", province), ScoreMode.Total));
        }
        if (StringUtils.isNotBlank(city)) {
            bool.must(QueryBuilders.nestedQuery("relation_infos",
                    QueryBuilders.termQuery("relation_infos.city_code", city), ScoreMode.Total));
        }
        if (StringUtils.isNotBlank(area)) {
            bool.must(QueryBuilders.nestedQuery("relation_infos",
                    QueryBuilders.termQuery("relation_infos.area_code", area), ScoreMode.Total));
        }
        return bool;
    }
}