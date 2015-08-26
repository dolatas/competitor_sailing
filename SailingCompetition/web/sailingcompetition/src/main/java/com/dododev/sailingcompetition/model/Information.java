package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;

/**
 * Created by sdolata on 2015-08-18.
 */
@Entity
@Table(name = "tb_information")
@Indexed
@XmlRootElement
public class Information extends BaseObject implements Serializable {
	private static final long serialVersionUID = 2149987512441145053L;
	private Long id;
    private Date time;
    private String content;
    private Race race;
    
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_information")
	@SequenceGenerator(name = "sq_information", sequenceName = "sq_information", allocationSize = 1)
	@DocumentId
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "time")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @ManyToOne
	@JoinColumn(name = "race_id")
    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

	@Override
	public String toString() {
		return "Information[ id: " + id + ", time: " + time + ", content: " + content + " ]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Information other = (Information) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 17;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


}
