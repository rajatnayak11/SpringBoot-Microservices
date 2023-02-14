package com.microservices.rating.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handerResourceNotFoundException(ResourceNotFoundException ex)
	{
		return new ResponseEntity<String>("Rating not found in the server!!",HttpStatus.NOT_FOUND);
	}
}