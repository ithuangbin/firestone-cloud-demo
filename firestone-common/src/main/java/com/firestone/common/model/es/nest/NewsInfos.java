/**
 * Project Name:fire-industry-map
 * File Name:NewsInfos.java
 * Package Name:com.firestone.bean.es.nested
 * Date:2018年8月1日下午10:35:57
 *
*/

package com.firestone.common.model.es.nest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description:舆情动态信息部分
 * @author lvxc
 * @date 2018年8月1日 下午10:35:57
 */
@ApiModel
public class NewsInfos implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String doc_id ; 
    //标题
    @ApiModelProperty(value = "标题", example = "标题）")
    private String title ;
    //发布日期
    @ApiModelProperty(value = "发布日期", example = "发布日期）")
    private String publish_timestamp ;
    //来源
    @ApiModelProperty(value = "来源", example = "来源）")
    private String source ;
    //摘要
    @ApiModelProperty(value = "摘要", example = "摘要）")
    private String summary ;
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
    public String getPublish_timestamp() {
        return publish_timestamp;
    }
    public void setPublish_timestamp(String publish_timestamp) {
        this.publish_timestamp = publish_timestamp;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    

}

