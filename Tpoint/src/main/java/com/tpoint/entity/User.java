package com.tpoint.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue
	private long id;

	@NotBlank
	private String userName;

	@NotBlank
	private String password;

//	@NotBlank
	private Boolean loggedIn;

	public User() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, password, loggedIn, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && Objects.equals(password, other.password) && Objects.equals(loggedIn, other.loggedIn)
				&& Objects.equals(userName, other.userName);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getStatus() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean status) {
		this.loggedIn = status;
	}

	public User(long id, @NotBlank String userName, @NotBlank String password, @NotBlank Boolean status) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.loggedIn = status;
	}

}
