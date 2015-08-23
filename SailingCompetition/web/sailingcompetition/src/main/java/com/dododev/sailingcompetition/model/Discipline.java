package com.dododev.sailingcompetition.model;

import com.dododev.sailingcompetition.dict.DisciplineType;

/**
 * Created by hp on 2015-05-17.
 */
public class Discipline {
    private Long id;
    private String name;
    private DisciplineType type;

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

    public DisciplineType getType() {
        return type;
    }

    public void setType(DisciplineType type) {
        this.type = type;
    }
}
