package com.microservices.user.service.service;

import java.util.List;

import com.microservices.user.service.entity.User;


public interface IUserService {
	
	public List<User> getAllUsers();
	public User getUserById(String userId);
	public User addUser(User user);
	public User updateUser(User user);
	public void deleteUserById(String userId);
	

}
