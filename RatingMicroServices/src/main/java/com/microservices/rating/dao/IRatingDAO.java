package com.microservices.rating.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.microservices.rating.entity.Rating;

@Repository
public interface IRatingDAO extends JpaRepository<Rating, String>{
	
//	@Query("SELECT r from Rating where r.userId =:id")
	List<Rating> findByUserId(String userId);
	
// 	@Query("SELECT r from Rating r where r.hotelId =:id")
	List<Rating> findByHotelId(String hotelId);

}
