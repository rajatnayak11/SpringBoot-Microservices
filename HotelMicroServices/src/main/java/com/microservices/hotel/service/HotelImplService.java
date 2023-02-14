package com.microservices.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.microservices.hotel.dao.IHotelDAO;
import com.microservices.hotel.entity.Hotel;
import com.microservices.hotel.exception.ResourceNotFoundException;

@Service
public class HotelImplService implements IHotelService {
	
	@Autowired
	private IHotelDAO hotelDAO;

	@Override
	public List<Hotel> getAllHotels() {
		List<Hotel> hotelList = hotelDAO.findAll();
		return hotelList;
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		Hotel hotel = hotelDAO.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel with ID "+hotelId+" not found in the server!!"));
		return hotel;
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		hotelDAO.save(hotel);
		return hotel;
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		hotelDAO.save(hotel);
		return hotel;
	}

	@Override
	public void deleteHotelById(String hotelId) {
		Hotel hotel = hotelDAO.findById(hotelId).get();
		hotelDAO.delete(hotel);
	}
}
