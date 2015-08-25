package com.dododev.sailingcompetition.model;

import java.io.Serializable;

/**
 * Created by hp on 2015-05-09.
 */
public class Race implements Serializable{
    private Long id;
    private SubDisciplineCompetition subCompetition;
    private Coach referee;
    private Track track;

    //TODO uzupe³niæ klasê Race


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubDisciplineCompetition getSubCompetition() {
        return subCompetition;
    }

    public void setSubCompetition(SubDisciplineCompetition subCompetition) {
        this.subCompetition = subCompetition;
    }

    public Coach getReferee() {
        return referee;
    }

    public void setReferee(Coach referee) {
        this.referee = referee;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

}
