package com.microservices.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.user.service.entity.User;
import com.microservices.user.service.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	

	
	@GetMapping
	public List<User> getAllUsers()
	{
		return this.userService.getAllUsers();
	}
	
	@GetMapping("/{userId}")
	public User getUserById(@PathVariable String userId)
	{
		return this.userService.getUserById(userId);
	}
	
	@PostMapping
	public User addUser(@RequestBody User user)
	{
		return this.userService.addUser(user);
	}
	
	@PutMapping
	public User updateUser(@RequestBody User user)
	{
		return this.userService.updateUser(user);
	}
	
	@DeleteMapping("/{userId}")
	public void deleteUserById(@PathVariable String userId)
	{
		this.userService.deleteUserById(userId);		
	}
	

}
