package com.microservices.user.service.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.user.service.dao.IUserDAO;
import com.microservices.user.service.entity.Hotel;
import com.microservices.user.service.entity.Rating;
import com.microservices.user.service.entity.User;
import com.microservices.user.service.exception.ResourceNotFoundException;

@Service
public class UserImplService implements IUserService{

	@Autowired
	private IUserDAO userDAO;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<User> getAllUsers() {
		List<User> userList = userDAO.findAll();
		return userList;
	}

	@Override
	public User getUserById(String userId) {
		User user = userDAO.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with ID "+userId+" not found in the server!!"));
		
		Rating[] userRatingById = restTemplate.getForObject("http://RATING-SERVICE/rating/user/"+user.getUserId(),Rating[].class);
		
		List<Rating> ratings = Arrays.stream(userRatingById).toList();
		
		List<Rating> ratingList = ratings.stream().map( rating -> {
			
			Hotel hotelList = restTemplate.getForObject("http://HOTEL-SERVICE/hotel/"+rating.getHotelId(), Hotel.class);
			
			rating.setHotel(hotelList);
			
			return rating;
			
			
		}).collect(Collectors.toList());
		
		
		user.setRatings(ratingList);
		
		return user;
	}

	@Override
	public User addUser(User user) {
		userDAO.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		userDAO.save(user);
		return user;
	}

	@Override
	public void deleteUserById(String userId) {
		User user = userDAO.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with ID "+userId+" not found in the server!!"));	
		userDAO.delete(user);
	}
	
	
	
	
	
}
