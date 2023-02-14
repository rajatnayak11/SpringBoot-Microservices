package com.microservices.user.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.user.service.entity.User;

@Repository
public interface IUserDAO extends JpaRepository<User, String> {

}
