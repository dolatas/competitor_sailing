package com.dododev.sailingcompetition.model;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;

import com.dododev.sailingcompetition.dict.DisciplineType;

/**
 * Created by hp on 2015-05-17.
 */
@Entity
@Table(name = "tb_discipline")
@Indexed
@XmlRootElement
public class Discipline extends BaseObject implements Serializable {
	private static final long serialVersionUID = 2931935496297722779L;
	
	private Long id;
    private String name;
    private DisciplineType type;
    private Competition competition;
    private List<SubDiscipline> subDiscipline;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_discipline")
	@SequenceGenerator(name = "sq_discipline", sequenceName = "sq_discipline", allocationSize = 1)
	@DocumentId
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
	@Enumerated(EnumType.STRING)
	@Column(name = "discipline_type")
    public DisciplineType getType() {
        return type;
    }

    public void setType(DisciplineType type) {
        this.type = type;
    }

    @OneToOne(fetch = FetchType.LAZY)
	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "discipline")
	public List<SubDiscipline> getSubDiscipline() {
		return subDiscipline;
	}

	public void setSubDiscipline(List<SubDiscipline> subDiscipline) {
		this.subDiscipline = subDiscipline;
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
		Discipline other = (Discipline) o;
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
