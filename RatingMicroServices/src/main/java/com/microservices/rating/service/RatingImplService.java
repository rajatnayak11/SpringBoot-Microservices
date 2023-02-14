package com.microservices.rating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.microservices.rating.dao.IRatingDAO;
import com.microservices.rating.entity.Rating;
import com.microservices.rating.exception.ResourceNotFoundException;

@Service
public class RatingImplService implements IRatingService {

	@Autowired
	private IRatingDAO ratingDAO;
	
	@Override
	public List<Rating> getAllRating() {
		List<Rating> ratingList = ratingDAO.findAll();
		return ratingList;
	}

	@Override
	public Rating addRating(Rating rating) {
		ratingDAO.save(rating);
		return rating;
	}

	@Override
	public Rating updateRating(Rating rating) {
		ratingDAO.save(rating);
		return rating;
	}

	@Override
	public void deleteRatingById(String ratingId) {
		Rating rating = ratingDAO.findById(ratingId).get();
		ratingDAO.delete(rating);		
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		List<Rating> ratingList = ratingDAO.findByUserId(userId);
		return ratingList;
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		List<Rating> ratingList = ratingDAO.findByHotelId(hotelId);
		return ratingList;
		
	}
}
