package com.microservices.user.service.entity;

public class Rating {
	
	private String ratingId;
	private String userId;
	private String hotelId;
	private int stars;
	private String comment;
	
	private Hotel hotel;
	
	public Rating() {}
	
	

	public Rating(String ratingId, String userId, String hotelId, int stars, String comment, Hotel hotel) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.stars = stars;
		this.comment = comment;
		this.hotel = hotel;
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
	
	

	public Hotel getHotel() {
		return hotel;
	}



	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}



	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", stars=" + stars
				+ ", comment=" + comment + ", hotel=" + hotel + "]";
	}



	
}
