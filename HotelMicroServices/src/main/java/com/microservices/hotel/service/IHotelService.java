package com.microservices.hotel.service;

import java.util.List;

import com.microservices.hotel.entity.Hotel;

public interface IHotelService {
	
	public List<Hotel> getAllHotels();
	public Hotel getHotelById(String hotelId);
	public Hotel addHotel(Hotel hotel);
	public Hotel updateHotel(Hotel hotel);
	public void deleteHotelById(String hotelId);
	
}
