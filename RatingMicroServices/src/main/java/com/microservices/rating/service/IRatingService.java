package com.microservices.rating.service;

import java.util.List;

import com.microservices.rating.entity.Rating;

public interface IRatingService {
	
	public List<Rating> getAllRating();
	public Rating addRating(Rating rating);
	public Rating updateRating(Rating rating);
	public void deleteRatingById(String ratingId);
	
	public List<Rating> getRatingByUserId(String userId);
	public List<Rating> getRatingByHotelId(String hotelId);

}
