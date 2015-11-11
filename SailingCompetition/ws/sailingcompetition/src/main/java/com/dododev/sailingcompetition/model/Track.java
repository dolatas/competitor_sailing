package com.dododev.sailingcompetition.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by dodo on 2015-08-20.
 */
@Entity
@Table(name = "tb_track")
@XmlRootElement
public class Track extends BaseObject implements Serializable {
	private static final long serialVersionUID = -2018666360403905018L;
	
	private Long id;
    private String name;
    private Integer pointsNo;
    private Integer start1;
    private Integer start2;
    private Integer finish1;
    private Integer finish2;
    private byte[] photo;
    private Race race;

    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_track")
	@SequenceGenerator(name = "sq_track", sequenceName = "sq_track", allocationSize = 1)
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

    @Column(name = "points_no")
    public Integer getPointsNo() {
        return pointsNo;
    }

    public void setPointsNo(Integer pointsNo) {
        this.pointsNo = pointsNo;
    }

    @Column(name = "start1")
    public Integer getStart1() {
        return start1;
    }

    public void setStart1(Integer start1) {
        this.start1 = start1;
    }

    @Column(name = "start2")
    public Integer getStart2() {
        return start2;
    }

    public void setStart2(Integer start2) {
        this.start2 = start2;
    }

    @Column(name = "finish1")
    public Integer getFinish1() {
        return finish1;
    }

    public void setFinish1(Integer finish1) {
        this.finish1 = finish1;
    }

    @Column(name = "finish2")
    public Integer getFinish2() {
        return finish2;
    }

    public void setFinish2(Integer finish2) {
        this.finish2 = finish2;
    }

    @Lob
    @Column(name = "photo")
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @OneToOne(fetch = FetchType.LAZY)
    public Race getRace() {
		return race;
	}
    
    public void setRace(Race race) {
		this.race = race;
	}

	@Override
	public String toString() {
		return "Track[ id: " + id + ", name: " + name + " ]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Track other = (Track) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 29;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
