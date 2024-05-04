package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandle {

	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> handle(AgeException e){
		return new ResponseEntity<>("Student Age is Less than 18",HttpStatus.NOT_ACCEPTABLE);
	}
}
