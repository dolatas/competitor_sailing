package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.dododev.sailingcompetition.dict.CompetitionType;

/**
 * Created by hp on 2015-05-09.
 */
public class Competition implements Serializable {
    private Long id;
    private CompetitionType competitionType;
    private Long areaId;
    private Discipline discipline;
    private Place place;
    private String name;
    private Date dateFrom;
    private Date dateTo;
    private String organizer;
    private Boolean showGPS;
    private Double fee;
    private List<Coach> referees;
    private List<Document> documents;
    private List<SubCompetition> subCompetitions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompetitionType getCompetitionType() {
        return competitionType;
    }

    public void setCompetitionType(CompetitionType competitionType) {
        this.competitionType = competitionType;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public Boolean getShowGPS() {
        return showGPS;
    }

    public void setShowGPS(Boolean showGPS) {
        this.showGPS = showGPS;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public List<Coach> getReferees() {
        return referees;
    }

    public void setReferees(List<Coach> referees) {
        this.referees = referees;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<SubCompetition> getSubCompetitions() {
        return subCompetitions;
    }

    public void setSubCompetitions(List<SubCompetition> subCompetitions) {
        this.subCompetitions = subCompetitions;
    }
}
