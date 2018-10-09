/**
 * Project Name:fire-industry-map
 * File Name:EsConfig.java
 * Package Name:com.firestone.config.es
 * Date:2018年7月5日上午9:41:05
 *
*/

package com.firestone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.TransportClientFactoryBean;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @Description: es相关配置注入
 * @author lvxc
 * @date 2018年7月5日 上午9:41:05
 */

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.firestone.dao")
public class ElasticSearchConfig {
    //es集群名称spring:

//    @Value("${spring.data.elasticsearch.clusterName}")
//    private String clusterName ="elasticsearch";
//
//    //节点集合
//    @Value("${spring.data.elasticsearch.clusterNodes}")
//    private String clusterNodes;
//
//    private Client client() throws Exception {
//        TransportClientFactoryBean client = new TransportClientFactoryBean();
//        client.setClusterNodes(clusterNodes);
//        client.setClusterName(clusterName);
//        client.afterPropertiesSet();
//        return client.getObject();
//    }
    

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws Exception {
        return new ElasticsearchTemplate(new TransportClientFactoryBean().getObject());
    }
}

