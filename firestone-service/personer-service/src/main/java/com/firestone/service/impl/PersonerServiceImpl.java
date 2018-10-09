package com.firestone.service.impl;

import com.firestone.common.model.es.CydnPersonInformationInfos;
import com.firestone.common.service.BaseService;
import com.firestone.service.IPersonerService;
import org.elasticsearch.common.Strings;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @Auther: huang
 * @Date: 2018/10/9 20:32
 * @Description:
 */
@Service
public class PersonerServiceImpl extends BaseService implements IPersonerService {

    @Override
    public CydnPersonInformationInfos findDetail(String id, String areaId) {
        Assert.notNull(id,"人才id不能为空");
        Assert.notNull(areaId,"mapId不能为空");
        BoolQueryBuilder bool = new BoolQueryBuilder();
        bool.must(QueryBuilders.termQuery("name_id",id)).must(QueryBuilders.termQuery("map_id",areaId));
        StringQuery stringQuery  = new StringQuery(Strings.toString(bool));
        List<CydnPersonInformationInfos> personInformationInfoss = getElasticsearchOperations().queryForList(stringQuery, CydnPersonInformationInfos.class);
        CydnPersonInformationInfos personInformationInfos = new CydnPersonInformationInfos();
        if (personInformationInfoss != null && personInformationInfoss.size() > 0){
            personInformationInfos = personInformationInfoss.get(0);
        }
        return personInformationInfos;
    }
}