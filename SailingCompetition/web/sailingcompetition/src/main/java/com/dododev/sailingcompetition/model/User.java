package com.dododev.sailingcompetition.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;

import com.dododev.sailingcompetition.dict.AccountType;
import com.dododev.sailingcompetition.dict.Gender;

/**
 * Created by hp on 2015-05-09.
 */
@Entity
@Table(name = "tb_user")
@Indexed
@XmlRootElement
public class User extends BaseObject implements Serializable{
	private static final long serialVersionUID = -4317785321721463531L;
	
	private Long id;
    private Gender gender;
    private String country;
    private Place place;
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

    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_user")
	@SequenceGenerator(name = "sq_user", sequenceName = "sq_user", allocationSize = 1)
	@DocumentId
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

	@Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

	@Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

	@Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	@Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

	@Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	@Column(name = "birth_date")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

	@Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	@Column(name = "phone")
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

    @Enumerated(EnumType.STRING)
	@Column(name = "first_name")
    public AccountType getDefaultAccountType() {
        return defaultAccountType;
    }

    public void setDefaultAccountType(AccountType defaultAccountType) {
        this.defaultAccountType = defaultAccountType;
    }

	@Override
	public String toString() {
		return "User[ id: " + id + ", login: " + login + ", firstName: " + firstName +", lastName: " + lastName +" ]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		User other = (User) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
