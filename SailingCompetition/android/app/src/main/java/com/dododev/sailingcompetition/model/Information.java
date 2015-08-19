package com.dododev.sailingcompetition.model;

import java.util.Date;

/**
 * Created by sdolata on 2015-08-18.
 */
public class Information {
    private Long id;
    private Date time;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
