package com.dododev.sailingcompetition.model;

import java.util.Date;

import com.dododev.sailingcompetition.dict.Gender;

/**
 * Created by hp on 2015-05-09.
 */
public class User {
    private Long id;
    private Gender gender;
    private String country;
    private String place;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private String phone;
    private Competitor competitorAccount;
    private Coach coachAccount;
    private AccountType defaultAccountType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Competitor getCompetitorAccount() {
        return competitorAccount;
    }

    public void setCompetitorAccount(Competitor competitorAccount) {
        this.competitorAccount = competitorAccount;
    }

    public Coach getCoachAccount() {
        return coachAccount;
    }

    public void setCoachAccount(Coach coachAccount) {
        this.coachAccount = coachAccount;
    }

    public AccountType getDefaultAccountType() {
        return defaultAccountType;
    }

    public void setDefaultAccountType(AccountType defaultAccountType) {
        this.defaultAccountType = defaultAccountType;
    }
}
