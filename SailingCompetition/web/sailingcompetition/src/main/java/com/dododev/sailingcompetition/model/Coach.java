package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;

/**
 * Created by dodo on 2015-08-10.
 */
@Entity
@Table(name = "tb_coach")
@Indexed
@XmlRootElement
public class Coach extends BaseObject implements Serializable{
	private static final long serialVersionUID = -6336414628947625474L;
	
	private Long id;
    private String licenseNo;
    private User user;
    private List<Competition> competitions;
    private List<Race> races;
    
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_coach")
	@SequenceGenerator(name = "sq_coach", sequenceName = "sq_coach", allocationSize = 1)
	@DocumentId
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "license_no")
    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    @OneToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "referees")
    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "race")
    public List<Race> getRaces() {
		return races;
	}
    
    public void setRaces(List<Race> races) {
		this.races = races;
	}
    
	@Override
	public String toString() {
		return "Coach[ id: " + id + ", licenseNo: " + licenseNo + " ]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Coach other = (Coach) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 13;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
