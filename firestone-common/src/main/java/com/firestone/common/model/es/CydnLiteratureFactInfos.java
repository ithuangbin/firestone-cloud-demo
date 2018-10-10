package com.firestone.common.model.es;

import com.firestone.common.model.constants.ElasticSearchConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.elasticsearch.annotations.Document;

/**
* @Description: (地图文献事实表)
* @param
* @return
* @author wuzy
* @date 2018/8/23/023 9:23
*/
@Document(indexName = ElasticSearchConstants.CYDN_LITERATURE_FACT_INFOS,type = "index")
@ApiModel
public class CydnLiteratureFactInfos extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
    * @Fields  :title (文献标题)
    */
    @ApiModelProperty(value = "文献标题", notes = "文献标题", example = "文献标题")
    private String title;
    
    /**
    * @Fields  :summary (文献摘要)
    */
    @ApiModelProperty(value = "文献摘要", notes = "文献摘要", example = "文献摘要")
    private String summary;
    
    /**
    * @Fields  :author (作者)
    */
    @ApiModelProperty(value = "作者", notes = "作者", example = "作者")
    private String author;
    
    /**
    * @Fields  :key_words (关键词)
    */
    @ApiModelProperty(value = "关键词", notes = "关键词", example = "关键词")
    private String key_words;
    
    /**
    * @Fields  :journal (期刊名称)
    */
    @ApiModelProperty(value = "期刊名称", notes = "期刊名称", example = "期刊名称")
    private String journal;

    /**
    * @Fields  :pubdate (发布时间)
    */
    @ApiModelProperty(value = "发布时间", notes = "发布时间", example = "发布时间")
    private String pubdate;

    /**
    * @Fields  :pub_year (发布年)
    */
    @ApiModelProperty(value = "发布年", notes = "发布年", example = "发布年")
    private String pub_year;

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPub_year() {
        return pub_year;
    }

    public void setPub_year(String pub_year) {
        this.pub_year = pub_year;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getKey_words() {
        return key_words;
    }

    public void setKey_words(String key_words) {
        this.key_words = key_words;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }
}
