package com.tpoint.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "login_details")
public class LoginDetails {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name",nullable = false)
	private String name;
	
	@Column(name="login_id",nullable = false,unique = true)
	private String LoginId;
	
	@Column(name="password",nullable = false)
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getLoginId() {
		return LoginId;
	}

	public void setLoginId(String loginId) {
		LoginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginDetails [id=");
		builder.append(id);
		builder.append(", Name=");
		builder.append(name);
		builder.append(", LoginId=");
		builder.append(LoginId);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
