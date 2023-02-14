package com.microservices.hotel.controller;

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

import com.microservices.hotel.entity.Hotel;
import com.microservices.hotel.service.IHotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private IHotelService hotelService;
	
	@GetMapping
	public List<Hotel> getAllHotels()
	{
		return this.hotelService.getAllHotels();
	}
	
	@GetMapping("/{hotelId}")
	public Hotel getHotelById(@PathVariable String hotelId)
	{
		return this.hotelService.getHotelById(hotelId);
	}
	
	@PostMapping
	public Hotel addHotel(@RequestBody Hotel hotel)
	{
		return this.hotelService.addHotel(hotel);
	}
	
	@PutMapping
	public Hotel updateHotel(@RequestBody Hotel hotel)
	{
		return this.hotelService.updateHotel(hotel);
	}
	
	@DeleteMapping("/{hotelId}")
	public void deleteHotelById(@PathVariable String hotelId)
	{
		this.hotelService.deleteHotelById(hotelId);
	}
	
	

}
