package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;

import com.dododev.sailingcompetition.dict.CompetitionType;

/**
 * Created by hp on 2015-05-09.
 */
@Entity
@Table(name = "tb_competition")
@Indexed
@XmlRootElement
public class Competition extends BaseObject implements Serializable {
	private static final long serialVersionUID = -8380250929006905497L;
	
	private Long id;
    private CompetitionType competitionType;
    private Long areaId; //TODO o co chodzi? 
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
    private List<Competitor> competitors;
    private List<SubDisciplineCompetition> subCompetitions;
    
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_competition")
	@SequenceGenerator(name = "sq_competition", sequenceName = "sq_competition", allocationSize = 1)
	@DocumentId
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	@Enumerated(EnumType.STRING)
	@Column(name = "competition_type")
    public CompetitionType getCompetitionType() {
        return competitionType;
    }

    public void setCompetitionType(CompetitionType competitionType) {
        this.competitionType = competitionType;
    }

    @Column(name = "area_id")
    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "competition", cascade = CascadeType.ALL)
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

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "date_from")
    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }


    @Column(name = "date_to")
    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    @Column(name = "organizer")
    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    @Column(name = "show_gps")
    public Boolean getShowGPS() {
        return showGPS;
    }

    public void setShowGPS(Boolean showGPS) {
        this.showGPS = showGPS;
    }

    @Column(name = "fee")
    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "tb_competition_referees", joinColumns = @JoinColumn(name = "competition_id") , inverseJoinColumns = @JoinColumn(name = "referee_id") )
    public List<Coach> getReferees() {
        return referees;
    }

    public void setReferees(List<Coach> referees) {
        this.referees = referees;
    }
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "competition")
    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "tb_competition_competitors", joinColumns = @JoinColumn(name = "competition_id") , inverseJoinColumns = @JoinColumn(name = "competititor_id") )
	public List<Competitor> getCompetitors() {
		return competitors;
	}
	
	public void setCompetitors(List<Competitor> competitors) {
		this.competitors = competitors;
	}
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "competition")
    public List<SubDisciplineCompetition> getSubCompetitions() {
        return subCompetitions;
    }

    public void setSubCompetitions(List<SubDisciplineCompetition> subCompetitions) {
        this.subCompetitions = subCompetitions;
    }

	@Override
	public String toString() {
		return "Competition[ id: " + id + ", name: " + name + " ]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Competition other = (Competition) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 3;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
