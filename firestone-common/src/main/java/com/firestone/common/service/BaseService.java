package com.firestone.common.service;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

/**
 * @Auther: huang
 * @Date: 2018/10/9 20:34
 * @Description:
 */
public class BaseService {

    private static ElasticsearchOperations elasticsearchOperations;

    public static ElasticsearchOperations getElasticsearchOperations() {
        return elasticsearchOperations;
    }

    public static void setElasticsearchOperations(ElasticsearchOperations elasticsearchOperations) {
        BaseService.elasticsearchOperations = elasticsearchOperations;
    }
}