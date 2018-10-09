/**
 * Project Name:fire-industry-map
 * File Name:LiteratureInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午8:54:08
 *
*/

package com.firestone.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: lvxc
 * @author 文献信息
 * @date 2018年8月1日 下午8:54:08
 */
@ApiModel
public class LiteratureInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    //文献id
    @ApiModelProperty(value = "文献id", example = "文献id）")
    private String doc_id;
    //文献名称
    @ApiModelProperty(value = "文献名称", example = "文献名称）")
    private String title ;
    //文献摘要
    @ApiModelProperty(value = "文献摘要", example = "文献摘要）")
    private String summary ;
    //作者
    @ApiModelProperty(value = "作者", example = "作者）")
    private String author ;
    //关键词
    @ApiModelProperty(value = "关键词", example = "关键词）")
    private String key_words ;
    //期刊名称
    @ApiModelProperty(value = "期刊名称", example = "期刊名称）")
    private String journal ;
    public String getDoc_id() {
        return doc_id;
    }
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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

