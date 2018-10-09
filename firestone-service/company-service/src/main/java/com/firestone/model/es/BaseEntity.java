package com.firestone.model.es;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;
    
    /**
    * @Fields source_doc_id : (源文档id)
    */
    private String source_doc_id;

    /**
    * @Fields mapId : (地图id)
    */
    private String map_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource_doc_id() {
        return source_doc_id;
    }

    public void setSource_doc_id(String source_doc_id) {
        this.source_doc_id = source_doc_id;
    }

    public String getMap_id() {
        return map_id;
    }

    public void setMap_id(String map_id) {
        this.map_id = map_id;
    }
    
}
