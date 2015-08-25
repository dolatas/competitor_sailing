package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;

/**
 * Created by dodo on 2015-08-20.
 */
@Entity
@Table(name = "tb_sub_discipline_competition")
@Indexed
@XmlRootElement
public class SubDisciplineCompetition extends BaseObject implements Serializable {
	private static final long serialVersionUID = 3562075182933383247L;

	private Long id;
	private Integer maxRaces;
	private Double fee;
	private Date flagAPOverAUp;
	private Date flagAPOverADown;
	private Date flagAPUp;
	private Date flagAPDown;
	private Competition competition;
	private SubDiscipline subDiscipline;
	private List<Competitor> competitors;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_sub_discipline_competition")
	@SequenceGenerator(name = "sq_sub_discipline_competition", sequenceName = "sq_sub_discipline_competition", allocationSize = 1)
	@DocumentId
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="max_races")
	public Integer getMaxRaces() {
		return maxRaces;
	}

	public void setMaxRaces(Integer maxRaces) {
		this.maxRaces = maxRaces;
	}

	@Column(name="fee")
	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Column(name="flag_AP_over_A_up")
	public Date getFlagAPOverAUp() {
		return flagAPOverAUp;
	}

	public void setFlagAPOverAUp(Date flagAPOverAUp) {
		this.flagAPOverAUp = flagAPOverAUp;
	}

	@Column(name="flag_AP_over_A_down")
	public Date getFlagAPOverADown() {
		return flagAPOverADown;
	}

	public void setFlagAPOverADown(Date flagAPOverADown) {
		this.flagAPOverADown = flagAPOverADown;
	}

	@Column(name="flag_AP_over_A_up")
	public Date getFlagAPUp() {
		return flagAPUp;
	}

	public void setFlagAPUp(Date flagAPUp) {
		this.flagAPUp = flagAPUp;
	}

	@Column(name="flag_AP_down")
	public Date getFlagAPDown() {
		return flagAPDown;
	}

	public void setFlagAPDown(Date flagAPDown) {
		this.flagAPDown = flagAPDown;
	}

	@ManyToOne
	@JoinColumn(name = "competition_id")
	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
	
	@ManyToOne
	@JoinColumn(name = "sub_discipline_id")
	public SubDiscipline getSubDiscipline() {
		return subDiscipline;
	}

	public void setSubDiscipline(SubDiscipline subDiscipline) {
		this.subDiscipline = subDiscipline;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "tb_sub_discipline_competitors", joinColumns = @JoinColumn(name = "sub_competition_id") , inverseJoinColumns = @JoinColumn(name = "competititor_id") )
	public List<Competitor> getCompetitors() {
		return competitors;
	}

	public void setCompetitors(List<Competitor> competitors) {
		this.competitors = competitors;
	}

	@Override
	public String toString() {
		return "SubDisciplineCompetition[ id: " + id + " ]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		SubDisciplineCompetition other = (SubDisciplineCompetition) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 11;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
