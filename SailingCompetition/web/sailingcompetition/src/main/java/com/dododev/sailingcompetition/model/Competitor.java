package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by hp on 2015-03-16.
 */
@DatabaseTable(tableName = "tb_competitor")
public class Competitor implements Serializable{
	private static final long serialVersionUID = -9004382836775746915L;
	
	@DatabaseField(generatedId = true, columnName = "id")
    private Long id;
    @DatabaseField(columnName = "sail_no")
    private String sailNo;
    @DatabaseField(columnName = "club_name")
    private String clubName;
    @DatabaseField(columnName = "license_no")
    private String licenseNo;
    @DatabaseField(columnName = "doctors_perm")
    private Date doctorsPem;
    private List<SubCompetition> subCompetitions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSailNo() {
        return sailNo;
    }

    public void setSailNo(String sailNo) {
        this.sailNo = sailNo;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public Date getDoctorsPem() {
        return doctorsPem;
    }

    public void setDoctorsPem(Date doctorsPem) {
        this.doctorsPem = doctorsPem;
    }

    public List<SubCompetition> getSubCompetitions() {
        return subCompetitions;
    }

    public void setSubCompetitions(List<SubCompetition> subCompetitions) {
        this.subCompetitions = subCompetitions;
    }
}
