package dodo.com.sailingcompetition.model;

import java.util.Date;

import dodo.com.sailingcompetition.dict.Gender;

/**
 * Created by hp on 2015-03-16.
 */
public class Competitor {
    private Long id;
    private Gender gender;
    private String country;
    private String place;
    private String language; //TODO move to settings?
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String sailNo;
    private String clubName;
    private String licenseNo;
    private String email;
    private String phone;
    private Date doctorsPem;

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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    public String getSailNo() {
        return sailNo;
    }

    public void setSailNo(String sailNo) {
        this.sailNo = sailNo;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
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

    public Date getDoctorsPem() {
        return doctorsPem;
    }

    public void setDoctorsPem(Date doctorsPem) {
        this.doctorsPem = doctorsPem;
    }
}
