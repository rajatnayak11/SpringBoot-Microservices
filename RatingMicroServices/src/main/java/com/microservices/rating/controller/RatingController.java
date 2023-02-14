package com.microservices.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.rating.entity.Rating;
import com.microservices.rating.service.IRatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private IRatingService ratingService;
	
	@GetMapping
	public List<Rating> getAllRatings()
	{
		return this.ratingService.getAllRating();
	}
	
	@GetMapping("/user/{userId}")
	public List<Rating> getRatingByUserId(@PathVariable String userId)
	{
		return this.ratingService.getRatingByUserId(userId);
	}
	
	@GetMapping("/hotel/{hotelId}")
	public List<Rating> getRatingByHotelId(@PathVariable String hotelId)
	{
		return this.ratingService.getRatingByHotelId(hotelId);
	}
	
	@PostMapping
	public Rating addRating(@RequestBody Rating rating)
	{
		return this.ratingService.addRating(rating);
	}
	
	@PutMapping
	public Rating updateRating(@RequestBody Rating rating)
	{
		return this.ratingService.updateRating(rating);
	}
	
	@DeleteMapping("/{ratingId}")
	public void deleteRatingById(@PathVariable String ratingId)
	{
		this.ratingService.deleteRatingById(ratingId);
	}
	
	
	

}
