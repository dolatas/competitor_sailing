package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;

/**
 * Created by hp on 2015-05-09.
 */
@Entity
@Table(name = "tb_race")
@Indexed
@XmlRootElement
public class Race extends BaseObject implements Serializable{
	private static final long serialVersionUID = -4249596015038785157L;
   
	private Long id;
    private SubDisciplineCompetition subDisciplineCompetition;
    private Coach referee;
    private Track track;
    private List<Information> informations;

    //TODO uzupe³niæ klasê Race

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_race")
	@SequenceGenerator(name = "sq_race", sequenceName = "sq_race", allocationSize = 1)
	@DocumentId
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @ManyToOne
	@JoinColumn(name = "sub_discipline_competition_id")
    public SubDisciplineCompetition getSubDisciplineCompetition() {
        return subDisciplineCompetition;
    }

    public void setSubDisciplineCompetition(SubDisciplineCompetition subDisciplineCompetition) {
        this.subDisciplineCompetition = subDisciplineCompetition;
    }
    
    @ManyToOne
	@JoinColumn(name = "referee_id")
    public Coach getReferee() {
        return referee;
    }

    public void setReferee(Coach referee) {
        this.referee = referee;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "race", cascade = CascadeType.ALL)
    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

	@Override
	public String toString() {
		return "Race[ id: " + id + " ]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Race other = (Race) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 41;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

}
