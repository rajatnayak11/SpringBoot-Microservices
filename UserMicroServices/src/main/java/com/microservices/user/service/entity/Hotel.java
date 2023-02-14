package com.microservices.user.service.entity;



public class Hotel {
	
	private String hotelId;
	private String hotelName;
	private String hotelLocation;
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