package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dodo on 2015-08-20.
 */
public class SubCompetition implements Serializable{
    private Long id;
    private Competition competition;
    private SubDiscipline subDiscipline;
    private Integer maxRaces;
    private Double fee;
    private Date flagAPOverAUp;
    private Date flagAPOverADown;
    private Date flagAPUp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public SubDiscipline getSubDiscipline() {
        return subDiscipline;
    }

    public void setSubDiscipline(SubDiscipline subDiscipline) {
        this.subDiscipline = subDiscipline;
    }

    public Integer getMaxRaces() {
        return maxRaces;
    }

    public void setMaxRaces(Integer maxRaces) {
        this.maxRaces = maxRaces;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Date getFlagAPOverAUp() {
        return flagAPOverAUp;
    }

    public void setFlagAPOverAUp(Date flagAPOverAUp) {
        this.flagAPOverAUp = flagAPOverAUp;
    }

    public Date getFlagAPOverADown() {
        return flagAPOverADown;
    }

    public void setFlagAPOverADown(Date flagAPOverADown) {
        this.flagAPOverADown = flagAPOverADown;
    }

    public Date getFlagAPUp() {
        return flagAPUp;
    }

    public void setFlagAPUp(Date flagAPUp) {
        this.flagAPUp = flagAPUp;
    }

    public Date getFlagAPDown() {
        return flagAPDown;
    }

    public void setFlagAPDown(Date flagAPDown) {
        this.flagAPDown = flagAPDown;
    }

    private Date flagAPDown;

}
