package com.dododev.sailingcompetition.model;

import java.io.Serializable;

/**
 * Created by dodo on 2015-08-20.
 */
public class Place implements Serializable {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
