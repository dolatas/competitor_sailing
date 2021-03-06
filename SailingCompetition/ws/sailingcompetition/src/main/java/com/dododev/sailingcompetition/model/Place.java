package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by dodo on 2015-08-20.
 */
@Entity
@Table(name = "tb_place")
@XmlRootElement
public class Place extends BaseObject implements Serializable {
	private static final long serialVersionUID = 7783768951241908031L;
	private Long id;
    private String name;
    private List<Competition> competitions;
    private List<User> users;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_place")
	@SequenceGenerator(name = "sq_place", sequenceName = "sq_place", allocationSize = 1)
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
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "place")
    public List<Competition> getCompetitions() {
		return competitions;
	}
    
    public void setCompetitions(List<Competition> competitions) {
		this.competitions = competitions;
	}

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "place")
    public List<User> getUsers() {
		return users;
	}
    
    public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Place[ id: " + id + ", name: " + name + " ]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Place other = (Place) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 19;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
