package dodo.com.sailingcompetition.model;

import java.util.Date;

import dodo.com.sailingcompetition.dict.CompetitionType;

/**
 * Created by hp on 2015-05-09.
 */
public class Competition {
    private Long id;
    private CompetitionType competitionType;
    private Long areaId;
    private Long disciplineId;
    private Long refereeId; //TODO maybe Referee referee;
    private Long secondRefereeId;
    private Long placeId;
    private String name;
    private Date dateFrom;
    private Date dateTo;
    private String organizer;
    private Boolean showGPS;
    private Double fee;

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

    public Long getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Long disciplineId) {
        this.disciplineId = disciplineId;
    }

    public Long getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(Long refereeId) {
        this.refereeId = refereeId;
    }

    public Long getSecondRefereeId() {
        return secondRefereeId;
    }

    public void setSecondRefereeId(Long secondRefereeId) {
        this.secondRefereeId = secondRefereeId;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
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
}
