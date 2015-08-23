package com.dododev.sailingcompetition.model;

import java.io.Serializable;

/**
 * Created by dodo on 2015-08-20.
 */
public class Track implements Serializable {
    private Long id;
    private String name;
    private Integer pointsNo;
    private Integer start1;
    private Integer start2;
    private Integer finish1;
    private Integer finish2;
    private byte[] photo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPointsNo() {
        return pointsNo;
    }

    public void setPointsNo(Integer pointsNo) {
        this.pointsNo = pointsNo;
    }

    public Integer getStart1() {
        return start1;
    }

    public void setStart1(Integer start1) {
        this.start1 = start1;
    }

    public Integer getStart2() {
        return start2;
    }

    public void setStart2(Integer start2) {
        this.start2 = start2;
    }

    public Integer getFinish1() {
        return finish1;
    }

    public void setFinish1(Integer finish1) {
        this.finish1 = finish1;
    }

    public Integer getFinish2() {
        return finish2;
    }

    public void setFinish2(Integer finish2) {
        this.finish2 = finish2;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
