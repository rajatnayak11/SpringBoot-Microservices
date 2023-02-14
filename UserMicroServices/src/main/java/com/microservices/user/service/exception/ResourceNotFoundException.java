package com.microservices.user.service.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException()
	{
		super("User not found in the server!!");
	}
	
	public ResourceNotFoundException(String message)
	{
		super(message);
	}

}
