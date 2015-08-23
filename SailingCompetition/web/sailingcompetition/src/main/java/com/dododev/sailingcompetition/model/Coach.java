package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dodo on 2015-08-10.
 */
public class Coach implements Serializable{
    private Long id;
    private String licenseNo;
    private List<Competition> competitions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }
}
