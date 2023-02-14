package com.microservices.rating.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "rating_ms")
public class Rating {
	
	@Id
	private String ratingId;
	
	@Column
	private String userId;
	
	@Column
	private String hotelId;
	
	@Column
	private int stars;
	
	@Column
	private String comment;
	
	public Rating() {}
	
	public Rating(String ratingId, String userId, String hotelId, int stars, String comment)
	{
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.stars = stars;
		this.comment = comment;
	}

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", stars=" + stars
				+ ", comment=" + comment + "]";
	}
}
