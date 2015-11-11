package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hp on 2015-03-16.
 */
@Entity
@Table(name = "tb_competitor")
@XmlRootElement
public class Competitor extends BaseObject implements Serializable{
	private static final long serialVersionUID = -9004382836775746915L;
	
    private Long id;
    private String sailNo;
    private String clubName;
    private String licenseNo;
    private Date doctorsPem;
    private Set<Competition> competitions;
    private List<SubDisciplineCompetition> SubDisciplineCompetitions;
    private User user;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_competitor")
	@SequenceGenerator(name = "sq_competitor", sequenceName = "sq_competitor", allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "sail_no")
    public String getSailNo() {
        return sailNo;
    }

    public void setSailNo(String sailNo) {
        this.sailNo = sailNo;
    }

    @Column(name = "club_name")
    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    @Column(name = "license_no")
    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    @Column(name = "doctors_perm")
    public Date getDoctorsPem() {
        return doctorsPem;
    }

    public void setDoctorsPem(Date doctorsPem) {
        this.doctorsPem = doctorsPem;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "competitors")
    public List<SubDisciplineCompetition> getSubDisciplineCompetitions() {
        return SubDisciplineCompetitions;
    }

    public void setSubDisciplineCompetitions(List<SubDisciplineCompetition> subDisciplineCompetitions) {
        this.SubDisciplineCompetitions = subDisciplineCompetitions;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "competitors")
	public Set<Competition> getCompetitions() {
		return competitions;
	}

	public void setCompetitions(Set<Competition> competitions) {
		this.competitions = competitions;
	}

    @OneToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Competitor[ id: " + id + ", sailNo: " + sailNo + ", clubName: " + clubName + " ]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Competitor other = (Competitor) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 7;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
