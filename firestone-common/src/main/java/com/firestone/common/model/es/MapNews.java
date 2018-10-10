package com.firestone.common.model.es;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author hel
 * @Description: (地图 - 新闻表)
 * @return
 * @date 2018/7/23/023 10:32
 */
@Document(indexName = "map_news", type = "index", createIndex = false)
public class MapNews extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /**
     * @Fields title : (标题)
     */
    private String title;

    /**
     * @Fields publish_timestamp : (发布日期)
     */
    private String publish_timestamp;

    /**
     * @Fields source : (来源)
     */
    private String source;

    /**
     * @Fields host : (发布方)
     */
    private String host;

    /**
     * @Fields content : (内容)
     */
    private String content;

    /**
     * @Fields province_code : (公司所在省份代码)
     */
    private String detail_url;

    /**
     * @Fields province_code : (公司所在省份代码)
     */
    private String province_code;

    /**
     * @Fields city_code : (公司所在城市代码)
     */
    private String city_code;

    /**
     * @Fields county_code : (公司所在县区代码)
     */
    private String county_code;

    /**
     * @Fields ismedical : (是否医健)
     */
    private String ismedical;

    private String publish_time;

    private String yM;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublish_timestamp() {
        return publish_timestamp;
    }

    public void setPublish_timestamp(String publish_timestamp) {
        if (StringUtils.isNotBlank(publish_timestamp)){
            publish_timestamp = publish_timestamp.split(" ")[0];
        }
        this.publish_timestamp = publish_timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDetail_url() {
        return detail_url;
    }

    public void setDetail_url(String detail_url) {
        this.detail_url = detail_url;
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

    public String getIsmedical() {
        return ismedical;
    }

    public void setIsmedical(String ismedical) {
        this.ismedical = ismedical;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public String getyM() {
        return yM;
    }

    public void setyM(String yM) {
        this.yM = yM;
    }
}
