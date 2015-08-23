package com.dododev.sailingcompetition.model;

/**
 * Created by hp on 2015-05-17.
 */
public class SubDiscipline {

    private Long id;
    private String name;
    private Discipline discipline;

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

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}
