package com.dashboard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@Column(name="Id")
	private Integer id;
	@Column(name="name_")
	private String name_;
	@Column(name="email")
	private String email;
	@Column(name="role_")
	private String role_;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName_() {
		return name_;
	}
	public void setName_(String name_) {
		this.name_ = name_;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole_() {
		return role_;
	}
	public void setRole_(String role_) {
		this.role_ = role_;
	}

}
