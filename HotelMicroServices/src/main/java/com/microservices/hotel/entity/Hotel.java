package com.microservices.hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel_ms")
public class Hotel {
	
	@Id
	private String hotelId;
	
	@Column
	private String hotelName;
	
	@Column
	private String hotelLocation;
	
	@Column
	private String hotelAbout;
	
	public Hotel() {}
	
	public Hotel(String hotelId, String hotelName, String hotelLocation, String hotelAbout)
	{
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		this.hotelAbout = hotelAbout;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public String getHotelAbout() {
		return hotelAbout;
	}

	public void setHotelAbout(String hotelAbout) {
		this.hotelAbout = hotelAbout;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation
				+ ", hotelAbout=" + hotelAbout + "]";
	}
}