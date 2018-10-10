package com.firestone.service.impl;

import com.firestone.common.model.RespListDto;
import com.firestone.common.model.es.CydnMapProject;
import com.firestone.common.model.vo.BaseParam;
import com.firestone.common.service.BaseService;
import com.firestone.service.ICompanyService;
import org.elasticsearch.common.Strings;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
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
    public RespListDto standardInfo(BaseParam baseParam) {
        Assert.notNull(baseParam.getId(),"企业id不能为空");
        Assert.notNull(baseParam.getAreaId(),"mapId不能为空");
        return null;
    }
}