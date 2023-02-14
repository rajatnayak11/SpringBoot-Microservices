package com.microservices.hotel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.hotel.entity.Hotel;


@Repository
public interface IHotelDAO extends JpaRepository<Hotel, String> {

}
