package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hp on 2015-05-17.
 */
@Entity
@Table(name = "tb_sub_discipline")
@XmlRootElement
public class SubDiscipline extends BaseObject implements Serializable {

	private static final long serialVersionUID = 5704655725863904738L;
	
	private Long id;
    private String name;
    private Discipline discipline;
    private List<SubDisciplineCompetition> subDisciplineCompetition;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_sub_discipline")
	@SequenceGenerator(name = "sq_sub_discipline", sequenceName = "sq_sub_discipline", allocationSize = 1)
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
    
	@ManyToOne
	@JoinColumn(name = "discipline_id")
    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subDiscipline")
	public List<SubDisciplineCompetition> getSubDisciplineCompetition() {
		return subDisciplineCompetition;
	}

	public void setSubDisciplineCompetition(List<SubDisciplineCompetition> subDisciplineCompetition) {
		this.subDisciplineCompetition = subDisciplineCompetition;
	}

	@Override
	public String toString() {
		return "SubDiscipline[ id: " + id + ", name: " + name + " ]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		SubDiscipline other = (SubDiscipline) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 23;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
