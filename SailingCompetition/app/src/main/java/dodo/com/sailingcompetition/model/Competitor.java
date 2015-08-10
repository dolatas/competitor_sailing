package dodo.com.sailingcompetition.model;

import java.util.Date;

import dodo.com.sailingcompetition.dict.Gender;

/**
 * Created by hp on 2015-03-16.
 */
public class Competitor {
    private Long id;
    private String sailNo;
    private String clubName;
    private String licenseNo;
    private Date doctorsPem;

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
}
