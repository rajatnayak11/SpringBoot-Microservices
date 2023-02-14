package com.microservices.user.service.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "User_MS")
public class User {
	
	@Id
	private String userId;
	
	@Column
	private String userName;
	
	@Column
	private String userEmail;
	
	@Column
	private long userMobile;
	
	
	public User() {}
	
	public User(String userId, String userName, String userEmail, long userMobile)
	{
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public long getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(long userMobile) {
		this.userMobile = userMobile;
	}

	@Transient
	private List<Rating> ratings;


	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
	
	
	
	
	
	
}
